package w18comp1008s2apr10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class LaunchGUI extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("ContactView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("This is me!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
