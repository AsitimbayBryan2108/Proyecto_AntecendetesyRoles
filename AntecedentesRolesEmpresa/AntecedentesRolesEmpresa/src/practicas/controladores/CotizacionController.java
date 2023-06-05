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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practicas.dominio.Cotiza;
import practicas.dominio.DetCotizacion;
import practicas.repositorios.CotizacionListDAO;
import practicas.repositorios.ICotizacion;
import practicas.repositorios.IRecepcion;
import practicas.repositorios.ITecnicoDAO;
import practicas.repositorios.TecnicoListDao;

public class CotizacionController extends Application implements Initializable, IRecepcion {
    
    TecnicoListDao tecnico = new TecnicoListDao();  

    @FXML
    private Button btnFacturar;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtCliente;

    @FXML
    private Label lblTecnicos;

    @FXML
    private Label lblTotal;

    @FXML
    private TextField txtTotal;

    @FXML
    private TextField txtOrden;

    @FXML
    private Label lblPrecio;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCantidad;

    @FXML
    private Label lblDescripcion;

    @FXML
    private Button btnRechazar;

    @FXML
    private TextField txtCantidad;

    @FXML
    private Label lblDescripcionep;

    @FXML
    private TextArea txtDescripcionep;

    @FXML
    private Label lblCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private ListView<DetCotizacion> lstCotizacion;

    @FXML
    private Button btnRemover;

    @FXML
    private TextField txtTecnicoEncargado;

    public static void main(String[] args) 
    {
        launch(args);   //lanza el proceso grafico
    }
    
    int Cantidad_l ;
    Double Precio_l ;
    Double Total_l;
    static Double Total_3 = 0.00;

    //Para llenar el listView
    ObservableList<DetCotizacion> listaObservableDet = FXCollections.observableArrayList();
    ICotizacion cotizacionDAO = new CotizacionListDAO();

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/Cotizacion.fxml"));
        
        Scene ventana = new Scene(root, 500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Menu Recepcion");
        pantalla.show();

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
      
        int    codigo;
        String nombrecli;
        String novedad;
        String codig;

        for (Cotiza cotiza: cotizaLista) 
        {
            codigo    = cotiza.getCampo1();
            nombrecli = cotiza.getCampo2();
            novedad   = cotiza.getCampo3();
       
            codig = Integer.toString(codigo)  ;
            txtOrden.setText(codig);
            txtCliente.setText(nombrecli);
            txtDescripcionep.setText(novedad);
        }
        
        String tecnicoAsig = tecnico.buscardisp();
        txtTecnicoEncargado.setText(tecnicoAsig); 
        

    }

    public void cargarDetListView()    //llena la lista observable de cliente con la lista de clientes DAO
    {
        listaObservableDet.clear();
        lstCotizacion.getItems().clear();
        listaObservableDet.addAll(cotizacionDAO.consultarDet());
        lstCotizacion.getItems().addAll(listaObservableDet);
    }


    @FXML
    public void doInsDetalle()
    {
        Precio_l   = Double.parseDouble(txtPrecio.getText());
        Cantidad_l = Integer.parseInt(txtCantidad.getText());
        Total_l    = Precio_l * Cantidad_l ;
        Total_3    = Total_3 + Total_l;         
        
        DetCotizacion detcotizacion = new DetCotizacion();
        
        detcotizacion.setCantidad(Integer.parseInt(txtCantidad.getText()));
        detcotizacion.setDescripcion(txtDescripcion.getText());
        detcotizacion.setPrecio(Precio_l);
        
        cotizacionDAO.insertardet(detcotizacion);
        
        
        txtCantidad.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        
        String Total2 = String.valueOf(Total_3);
        txtTotal.setText(Total2);
        cargarDetListView();
       
    }
    
    @FXML
    public void doRechaazar()
    {
        Total_3    = 0.0;
        cotizacionDAO.limpiar();
        Precio_l   = 25.00;
        Total_3    = Total_3 + Precio_l;         
        
        DetCotizacion detcotizacion = new DetCotizacion();
        
        String l_descripcion = "Mantenimiento Tecnico";

        detcotizacion.setCantidad(1);
        detcotizacion.setDescripcion(l_descripcion);
        detcotizacion.setPrecio(Precio_l);
        
        cotizacionDAO.insertardet(detcotizacion);
        
        System.out.println(detcotizacion);
        
        txtCantidad.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        
        String Total2 = String.valueOf(Total_3);
        txtTotal.setText(Total2);
        cargarDetListView();
       
    }
    

    @FXML
    private void CerrarVentana(ActionEvent event) {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void doGrabar()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Cotizacion Generada Con Exito");
        alert.showAndWait();

    }
    
}
