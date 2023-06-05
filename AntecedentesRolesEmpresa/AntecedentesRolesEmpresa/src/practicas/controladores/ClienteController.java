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
import practicas.dominio.Cliente;
import practicas.repositorios.ClienteListDao;
import practicas.repositorios.IClienteDAO;


public class ClienteController extends Application implements Initializable{
    
    @FXML
    private TextField txtDireccion;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCorreo;

    @FXML
    private Label lblTelefono;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCorreo;

    @FXML
    private Label lblCliente;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtTelefono;

    @FXML
    private Label lblCedula;

    @FXML
    private TextField txtNombres;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Button btnGrabar;

    @FXML
    private Label lblDireccion;

    @FXML
    private Label lblNombres;


    @FXML
    private ListView<Cliente> listCliente;

    ObservableList<Cliente> listaObservableClientes = FXCollections.observableArrayList();
    IClienteDAO clienteDAO = new ClienteListDao();


    
    public static void main(String[] args) 
    {
        launch(args);   //lanza el proceso grafico
    }

    
    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/MntCliente.fxml"));
        
        Scene ventana = new Scene(root, 500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Mantenedor Cliente");
        pantalla.show();
        //cargarClientesListView() ;
        
    }
    
     
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) 
    {
        cargarClientesListView();

    }
   

    public void cargarClientesListView()    //llena la lista observable de cliente con la lista de clientes DAO
    {
       listaObservableClientes.clear();
        listCliente.getItems().clear();
        listaObservableClientes.addAll(clienteDAO.consultarTodos());
       //listaObservableClientes.addAll(clienteDAO.consultarTodos());
       listCliente.getItems().addAll(listaObservableClientes);
    }

    
    @FXML
    public void doSeleccionarCliente()
    {
        Cliente clienteSeleccionado = listCliente.getSelectionModel().getSelectedItem();

        txtCodigo.setText(String.valueOf(clienteSeleccionado.getCodigo()));
        txtCedula.setText(clienteSeleccionado.getCedula());
        txtNombres.setText(clienteSeleccionado.getNombres());
        txtTelefono.setText(clienteSeleccionado.getTelefono());
        txtDireccion.setText(clienteSeleccionado.getDireccion());
        txtCorreo.setText(clienteSeleccionado.getEmail());
    }
    
    @FXML
    public void doGrabarCliente()
    {
        //! Crear objeto cliente
        Cliente cliente = new Cliente();


        //! Recuperar los datos del UI y setear el objeto cliente
        cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
        cliente.setNombres(txtNombres.getText());
        cliente.setCedula(txtCedula.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setEmail(txtCorreo.getText());
        

        //! Guarda los datos con el dao de clientes
        clienteDAO.insertar(cliente);
        cargarClientesListView();
        

        txtCedula.setText(null);
        txtCodigo.setText(null);
        txtNombres.setText(null);
        txtDireccion.setText(null);
        txtCorreo.setText(null);
        txtTelefono.setText(null);


    
    }
    public void onEliminar(){
    
        txtCodigo.setText(null);
        txtNombres.setText(null);
        txtCedula.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);
        txtCorreo.setText(null);
     }
    
    


    @FXML
    private void CerrarVentana(ActionEvent event) {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

   
    
    


}
