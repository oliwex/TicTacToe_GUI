/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author oliwe
 */
public class GameController implements Initializable 
{



    
    @FXML
    private Text title_left;
    @FXML
    private Text title_right;
    @FXML
    private Text title_center;
    
    
    @FXML
    private ImageView image_left;
    @FXML
    private ImageView image_right;
    
    @FXML
    private GridPane gridpane;
    
    private void setTextProperties()
    {
        this.title_center.setText("Tic Tac Toe");
        this.title_left.setText("Naziści");
        this.title_right.setText("Komuniści");
    }
    private void setImageProperties()
    {
        this.image_left.setImage(new Image(new File("src/Img/CPU.png").toURI().toString()));
        this.image_right.setImage(new Image(new File("src/Img/PLAYER.png").toURI().toString()));
    }
    
    private void setBoard()
    {

        this.gridpane=new GridPane();


    }
    
    
    private void setElements()
    {
        this.setTextProperties();
        this.setImageProperties();
        this.setBoard();
    }

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.setElements();
    }    

}
