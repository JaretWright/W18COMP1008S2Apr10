package w18comp1008s2apr10;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class MyNameViewController implements Initializable
{
    @FXML private ImageView imageView;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        imageView.setImage(new Image("JW.jpg"));
    }    
    
}
