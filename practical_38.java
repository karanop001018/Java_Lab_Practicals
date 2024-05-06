import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class practical_38 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a button and a label
        Button button = new Button("Click me!");
        Label label = new Label("Welcome to JavaFx");
        button.setOnAction(event -> {
            boolean isVisible = label.isVisible();
            label.setVisible(!isVisible);
	    System.out.println("Welcome to JavaFx");
        });
        // Create a VBox layout container to hold the button and label
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, button);
        // Create a scene and add the VBox to it
        Scene scene = new Scene(vbox, 300, 200);
        // Set the scene on the primary stage and show it
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
//javac --module-path "C:\Program Files\Java\javafx\lib" --add-modules javafx.controls,javafx.fxml practical_38.java
//java --module-path "C:\Program Files\Java\javafx\lib" --add-modules javafx.controls practical_38
//jenkins like maven