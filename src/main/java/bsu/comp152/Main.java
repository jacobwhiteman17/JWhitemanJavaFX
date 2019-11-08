package bsu.comp152;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas drawingArea = new Canvas(800,400);
        VBox box = new VBox();
        TextField input = new TextField();
        Button myButton = new Button("Change Color");
        Rectangle rect = new Rectangle();

        input.setMaxWidth(400);

        rect.setHeight(250);
        rect.setWidth(350);
        rect.setFill(Paint.valueOf("Red"));

        box.setLayoutX(400);
        box.setSpacing(25);
        box.getChildren().add(input);
        box.getChildren().add(rect);
        box.getChildren().add(myButton);
        box.getChildren().add(drawingArea);
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rect.setFill(Paint.valueOf(input.getText()));
            }
        };
        myButton.setOnAction(handler);
        var firstScene = new Scene(box);
        primaryStage.setScene(firstScene);
        primaryStage.setTitle("Jacob Whiteman's Project");
        primaryStage.show();
    }
}
