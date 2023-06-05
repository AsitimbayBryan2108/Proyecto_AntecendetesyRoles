package practicas.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import practicas.dominio.Cliente;
import practicas.dominio.Turnos;
import practicas.repositorios.*;


public class MenuController extends Application implements Initializable{

    //Estructura donde se va a guardar los clientes
    //public ArrayList<Cliente> clienteArrayList = new ArrayList<Cliente>();
    
    public static int turno_g;

    @FXML
    private Button btnTecnico;

    @FXML
    private Label lblSubtitulo;

    @FXML
    private Button btnCotizacion;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button btnMantCliente;

    @FXML
    private Button btnRecepcion;

    public static int turnos_global;
    

    public static void main(String[] args) 
    {
        launch(args);   //lanza el proceso grafico
    }

    @Override
    public void start(Stage pantalla) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/Menu.fxml"));
        
        Scene ventana = new Scene(root, 600, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Menu Principal");
        pantalla.show();

    }

    @FXML
    public void CallReception() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/practicas/vistas/Recepcion.fxml"));
        Parent root = loader.load();
        RecepcionController controlador = loader.getController();
        controlador.recibeParametros(turno_g);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void CallCliente() throws IOException{
         
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/practicas/vistas/MntCliente.fxml"));
        Parent root = loader.load();
        ClienteController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void CallTecnico() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/practicas/vistas/MntTecnico.fxml"));
        Parent root = loader.load();
        TecnicoController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void CallCotizacion() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/practicas/vistas/Cotizacion.fxml"));
        Parent root = loader.load();
        CotizacionController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void CallTurno() throws IOException{
        turno_g = turno_g + 1;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/practicas/vistas/Turno.fxml"));
        Parent root = loader.load();
        TurnoController controlador = loader.getController();
        controlador.recibeParametros(turno_g);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        //Turnos turno = new Turnos();
        //turno.setTurnos(1);
        //turnos_global = turno.getTurnos();
    }

}

