package fx.customuictrl;



import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;



public class NumberTextField extends TextField {
    
    String numberRegEx = "[0-9]*";
    
    @Override
    public void replaceText(int start, int end, String text) {
        
        String oldValue = getText();
        if((validate(text))) {
            super.replaceText(start, end, text);
            String newText = super.getText();
            if(!validate(newText)) {
                super.setText(oldValue);
            }
        }
    }
    
    private boolean validate(String text) {
        
        return ("".equals(text) || text.matches(numberRegEx));
    }
}

/*
Класс проверяет, что все цифры от 0 до 9
и нет букв.
Переопределён метод replaceText, который
проверяет - если ввод соотв. регулярному выражению fx.customuictrl.NumberTextField.numberRegEx,
значит пишем, если не соотв. - ничего не делаем.
 */