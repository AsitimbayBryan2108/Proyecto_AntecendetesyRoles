package practicas.controladores;
 
 import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practicas.dominio.Cliente;
import practicas.dominio.Cotiza;
import practicas.dominio.Recepcion;
import practicas.repositorios.ClienteListDao;
import practicas.repositorios.IClienteDAO;
import practicas.repositorios.IRecepcion;
import practicas.repositorios.IRecepcionDao;
import practicas.repositorios.RecepcionListDao;

public class RecepcionController extends Application implements Initializable,IRecepcion{

     //Array List Para llenar Combo
     private ObservableList<String> equipos = FXCollections.observableArrayList();


    @FXML
    private Button btnGenerar;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextArea txtProblema;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Label lblProblema;

    @FXML
    private Label lblTitulo;

    @FXML
    private Label lblSerie;

    @FXML
    private TextField txtSerie;

    @FXML
    private TextField txtCliente;
    
    @FXML
    private TextField txtNombreCli;


    @FXML
    private ComboBox<String> cmbEquipo;

    @FXML
    private Label lblMarca;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCliente;

    @FXML
    private Label lblEquipo;

    @FXML
    private Label lblDescripcion;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private TextField txtTurno;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblTurno;

    @FXML
    private TextField txtTecnicoEncargado;

    
    @FXML
    private Label lblTecnicoEncargado;

    @FXML
    private Button btnbuscar;
    
    ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
    IClienteDAO clienteDAO = new ClienteListDao();
    IRecepcionDao recepcionDAO = new RecepcionListDao();

    public static void main(String[] args) 
    {
        launch(args);   //lanza el proceso grafico
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/Recepcion.fxml"));
        
        Scene ventana = new Scene(root, 500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Menu Recepcion");
        pantalla.show();

    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cargarComboEquipo();
        txtNombreCli.setDisable(true);;
        
    }
    
    @FXML
    private void cargarComboEquipo() {
        
        equipos.add("PORTATIL");
        equipos.add("DESK");
        equipos.add("IMPRESORAS");  
        
        //cmbEquipo.setItems(value);
        if (null != cmbEquipo) {
            cmbEquipo.setItems(equipos);
         }  
        //mbEquipo.setItems((ObservableList<?>) Equipos);     
    }


    @FXML
    private void CerrarVentana(ActionEvent event) {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void recibeParametros(int turno) {
        Integer contador = turno;   
        String textocontador = contador.toString();
        txtTurno.setDisable(true);
        txtTurno.setText(textocontador);
      
    }
     
    @FXML
    public void buscaCliente() {
      String CodigoBuscarc = txtCliente.getText();
      int CodigoBuscar = Integer.parseInt(CodigoBuscarc);   
      String Nombre =  clienteDAO.buscarNombre(CodigoBuscar);
      txtNombreCli.setText(Nombre);
    }
    
    @FXML
    public void GrabaRecepcion() {
      try {
        
        Recepcion reception = new Recepcion();
        Cotiza  cotiza = new Cotiza();

        int turno  = Integer.parseInt(txtTurno.getText());
        int codcli = Integer.parseInt(txtCliente.getText());
        
        //Se llama a un variable global de la interfaz
        
        cotiza.setCampo1(turno);
        cotiza.setCampo2(txtNombreCli.getText());
        cotiza.setCampo3(txtProblema.getText());

        reception.setTurno(turno);
        reception.setCodCli(codcli);
        reception.setDescripcion(txtDescripcion.getText());
        reception.setModelo(txtModelo.getText());
        reception.setSerie(txtSerie.getText());
        reception.setProblema(txtProblema.getText());
        reception.setTipoEquipo(cmbEquipo.getValue());
        
        cotizaLista.add(cotiza);
        recepcionDAO.insertar(reception);
        //cotizacionLista.

        //System.out.println(reception.getDescripcion());
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Informacion Guardada con Exito");
        alert.showAndWait();

       
        } catch (Exception e) {
            // TODO: handle exception
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Error en la aplicacion");
            alert.showAndWait();
        } 
    }
   
    
}
