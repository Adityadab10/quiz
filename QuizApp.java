import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.File;

public class QuizApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Quiz Application");

        // Create a WebView
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Load the HTML file
        String htmlFilePath = new File("home.html").toURI().toString();
        webEngine.load(htmlFilePath);

        // Create a StackPane to hold the WebView
        StackPane root = new StackPane();
        root.getChildren().add(webView);

        // Set the scene and show the stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
