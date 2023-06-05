package practicas.controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import practicas.dominio.Turnos;
import practicas.repositorios.ITurno;
import practicas.repositorios.Turno;

public class TurnoController extends Application implements Initializable{
    @FXML
    private Button btnturno;

    @FXML
    public TextField txtturno;
    
    public int textocontador;

    


    @Override
    public void start(Stage pantalla) throws Exception {
        // TODO Auto-generated method stub
        Parent root = FXMLLoader.load(getClass().getResource("/practicas/vistas/Turno.fxml"));
        
        Scene ventana = new Scene(root, 500, 500);

        pantalla.setScene(ventana);
        pantalla.setTitle("Menu Recepcion");
        pantalla.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        //Turnos turno = new Turnos(); 
        //Integer turnos = turnoDAO.incrementa();
        //Integer    turnox = turnos.getTurnos();
        //String turnoy = turnos.toString();
       // turno_g = turno_g ++;
        txtturno.setDisable(true);
        txtturno.setText("1");
         
    }

    @FXML
    public void recibeParametros(int turno) {
        Integer contador = turno;   
        String textocontador = contador.toString();
        txtturno.setDisable(true);
        txtturno.setText(textocontador);
      
    }

    public void setStage(Stage primaryStage) {
    }
    
}
