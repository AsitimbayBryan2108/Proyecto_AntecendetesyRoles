package practicas.controladores;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import practicas.repositorios.TecnicoListDao;
import practicas.dominio.Tecnico;
import practicas.repositorios.ITecnicoDAO;

public class TecnicoController extends Application implements Initializable{
    @FXML
    private Label lblEstado;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtEmail;

    @FXML
    private Label lblEmail;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Label lblTecnicos;

    @FXML
    private Label lblTelefono;

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtNombres;

    @FXML
    private Label lblCodigo;

    @FXML
    private Label lblDepartamento;

    @FXML
    private Button btnGrabar;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtDepartamento;

    @FXML
    private Label lblNombres;

    @FXML
    private ListView<Tecnico> lstTecnico;

    ObservableList<Tecnico> listaObservableTecnicos = FXCollections.observableArrayList();
    ITecnicoDAO tecnicoDAO = new TecnicoListDao();

    public static void main(String[] args) 
    {
        launch(args);   //lanza el proceso grafico
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/MntTecnico.fxml"));
        
        Scene ventana = new Scene(root, 500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Mantenimiento Tecnico");
        pantalla.show();

    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        cargarTecnicosListView();

    }
   

    public void cargarTecnicosListView()    //llena la lista observable de cliente con la lista de clientes DAO
    {
       listaObservableTecnicos.clear();
        lstTecnico.getItems().clear();
        listaObservableTecnicos.addAll(tecnicoDAO.consultarTodos());
       //listaObservableClientes.addAll(clienteDAO.consultarTodos());
       lstTecnico.getItems().addAll(listaObservableTecnicos);
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @FXML
    public void SeleccionarTecnico()
    {
        Tecnico tecnicoSeleccionado = lstTecnico.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(tecnicoSeleccionado.getCodigo()));
        txtNombres.setText(tecnicoSeleccionado.getNombres());
        txtTelefono.setText(tecnicoSeleccionado.getTelefono());
        txtDepartamento.setText(tecnicoSeleccionado.getDepartamento());
        txtEmail.setText(tecnicoSeleccionado.getEmail());
        txtEstado.setText(tecnicoSeleccionado.getEstado());
    }

    @FXML
    public void GrabarTecnico()
    {
        //! Crear objeto cliente
        Tecnico tecnico = new Tecnico();


        //! Recuperar los datos del UI y setear el objeto cliente
        tecnico.setCodigo(Integer.parseInt(txtCodigo.getText()));
        tecnico.setNombres(txtNombres.getText());
        tecnico.setTelefono(txtTelefono.getText());
        tecnico.setDepartamento(txtDepartamento.getText());
        tecnico.setEmail(txtEmail.getText());
        tecnico.setEstado(txtEstado.getText());
        

        //! Guarda los datos con el dao de clientes
        tecnicoDAO.insertar(tecnico);
        cargarTecnicosListView();
        txtCodigo.setText(null);
        txtNombres.setText(null);
        txtDepartamento.setText(null);
        txtEmail.setText(null);
        txtTelefono.setText(null);
        txtEstado.setText(null);
        

        


    
    }

    @FXML
    public void Cancelar()
    {

    }


    @FXML
    public void Limpiar()
    {
        txtCodigo.setText(null);
        txtNombres.setText(null);
        txtDepartamento.setText(null);
        txtEmail.setText(null);
        txtTelefono.setText(null);
        txtEstado.setText(null);
    }

    

    @FXML
    private void CerrarVentana(ActionEvent event) {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


}

    

