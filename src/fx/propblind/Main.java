package fx.propblind;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {

    public static void main(String[] args) {
        IntegerProperty integerProperty = new SimpleIntegerProperty(5);
        IntegerProperty integerPropertyRo = new ReadOnlyIntegerWrapper(5);

        IntegerBinding integerBinding = new IntegerBinding() {
            {
                super.bind(integerProperty, integerPropertyRo);
            }

            @Override
            protected int computeValue() {
                return integerProperty.get() + integerPropertyRo.get();
            }
        };
        System.out.println(integerBinding.get());
        integerProperty.set(1);
        System.out.println(integerBinding.get());
    }

    class User {
        StringProperty stringProperty = new SimpleStringProperty("Vachok");

        public String getStringProperty() {
            return stringProperty.get();
        }

        public void setStringProperty(String stringProperty) {
            this.stringProperty.set(stringProperty);
        }

        public StringProperty stringPropertyProperty() {
            return stringProperty;
        }

    }
}
// at 08.02.2018 (11:40)
/*
Обёртки для удобства использования в JavaFX
int i;
Integer integer;
SimpleIntegerProperty simpleIntegerProperty;
IntegerProperty integerProperty;
StringProperty stringProperty;
*/

// https://goo.gl/6JNND6 Рушим систему :)

/*
integerProperty, можно биндить. При изменении значения одного - будет меняться другое.
https://goo.gl/MRpV4G
*/

// https://goo.gl/oQSVKW Пытаемся связать несвязуемое
// https://goo.gl/hcCbYt BindBidirectional

/*
        integerProperty.addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("new value = " + newValue);
            }
        });

        integerProperty.bindBidirectional(integerPropertyRo);
        integerPropertyRo.set(6);
        integerProperty.set(7);*/

/*
High Level Binding Operation
https://goo.gl/7tGLc6 Property можно складывать (и др. операции)
*/

//https://goo.gl/y94wA6 Low Level Binding

