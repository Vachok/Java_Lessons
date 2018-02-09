package fx.customuictrl;



import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;



public class CustomControl extends VBox {
    
    @FXML
    private TextField textField;
    
    public CustomControl() throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("custom_control.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        fxmlLoader.load();
    }
    
    public String getText() {
        
        return textProperty().get();
    }
    
    public void setText(String value) {
        
        textProperty().set(value);
    }
    
    public StringProperty textProperty() {
        
        return textField.textProperty();
    }
    
    @FXML
    protected void doSomething() {
        
        System.out.println("The Button!");
    }
}