package fx.webhtjs;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class WebHtJS extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
//        webEngine.load("http://velkomfood.ru/");
        webEngine.loadContent("" +
                "<diz id='div'>hello world</div>" +
                "<script> document.getElementById('div').style.color='blue';" +
                "function changeColor() {" +
                "       document.getElementById( 'div' ).style.color='green';" +
                "       document.getElementById( 'div' ).innerHTML = myClass.getHello( 'Vachok' )" +
                "}</script>" +
                "");
        JSObject jsObject = (JSObject) webEngine.executeScript("window");
        jsObject.setMember("myClass", new MyClass());
        webEngine.getLoadWorker()
                .stateProperty()
                .addListener((obs, oldValue, newValue) -> {
                    if (newValue == Worker.State.SUCCEEDED) {
                        try {
                            webEngine.executeScript("changeColor();");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
        Group group = new Group();
        group.getChildren().addAll(webView);
        primaryStage.setScene(new Scene(group, 95, 33));
        primaryStage.show();
    }

    public class MyClass {

        public String getHello(String name) {

            return "hello" + name;
        }
    }
}
