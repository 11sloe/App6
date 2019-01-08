import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.scene.effect.*;
import javafx.scene.text.*;

public class Effekte extends Application
{
     @Override public void start(Stage primaryStage)
    {

        Group group = new Group();

        
        // A rectangle
        Rectangle r1 = new Rectangle(50,50,100,100);
        r1.setFill(Color.LIGHTGRAY);
        r1.setStroke(Color.BLACK);
        Rectangle r2 = new Rectangle(200,50, 100, 100);
        r2.setFill(Color.LIGHTGRAY);
        r2.setStroke(Color.BLACK);
        
        Text text1 = new Text(50, 300, "Hallo");
        text1.setFont(new Font(50));
        
        Text text2 = new Text(200, 300, "du!");
        text2.setFont(new Font(50));

        // Einen Schatteneffekt erzeugen
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(10.0);
        dropShadow.setOffsetX(5.0);
        dropShadow.setOffsetY(5.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));

        // Auf das Rechteck r1 anwenden
        r1.setEffect(dropShadow);
        
        // oder etwas kompakter
        r2.setEffect(new DropShadow(20, Color.color(0.8, 0.2, 0.4)));

        // geht auch mit Text!
        text1.setEffect(dropShadow);
        text2.setEffect(new DropShadow(20, Color.color(0.2, 0.2, 0.8)));
        
        group.getChildren().addAll(r1,r2,text1,text2);
        // Create the scene and the stage
        Scene scene = new Scene(group, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shape Maker");
        primaryStage.show();

    }

}
