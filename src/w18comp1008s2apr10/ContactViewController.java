/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18comp1008s2apr10;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class ContactViewController implements Initializable
{

    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField phoneTextField;

    /**
     * This method is called when the button is pushed and will read
     * from the text fields to create a new Contact object and display
     * it in the console
     */
    public void createContactButtonPushed()
    {
        try{
            Contact newContact = new Contact(this.firstNameTextField.getText(),
                                         this.lastNameTextField.getText(),
                                         this.phoneTextField.getText());
        
            System.out.printf("Contact: %s%n", newContact);
        }
        catch (IllegalArgumentException e)
        {
            System.err.println(e.getMessage());
        }
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
