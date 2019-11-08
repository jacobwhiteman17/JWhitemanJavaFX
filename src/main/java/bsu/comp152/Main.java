//Jacob Whiteman
package bsu.comp152;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;//these are the things I needed to import

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Canvas drawingArea = new Canvas(800,400);//set window area
        VBox box = new VBox();//where I will fill everything in
        TextField input = new TextField();//where you will type
        Button myButton = new Button("Change Color");//button
        Rectangle rect = new Rectangle();//rect

        input.setMaxWidth(400);//aesthetics

        rect.setHeight(250);
        rect.setWidth(350);
        rect.setFill(Paint.valueOf("Red"));//making the rectangle

        box.setLayoutX(400);//center it
        box.setSpacing(25);//space things
        box.setBackground(Background.EMPTY);//making the background white
        box.getChildren().add(input);//adding
        box.getChildren().add(rect);
        box.getChildren().add(myButton);
        box.getChildren().add(drawingArea);
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {//creating event handler
            @Override
            public void handle(ActionEvent event) {
                rect.setFill(Paint.valueOf(input.getText()));//making it change the color
            }
        };
        myButton.setOnAction(handler);//setting handler on the button
        var firstScene = new Scene(box);
        primaryStage.setScene(firstScene);
        primaryStage.setTitle("Jacob Whiteman's Project");
        primaryStage.show();//setting everything else up
    }
}
