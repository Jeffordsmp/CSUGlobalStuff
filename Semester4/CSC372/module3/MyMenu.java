import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;
import javafx.scene.paint.Color;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileWriter;

public class MyMenu extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Menu Example");
        MenuItem menuItem1 = new MenuItem("Date And Time");
        MenuItem menuItem2 = new MenuItem("Text Box with Submit button");
        MenuItem menuItem3 = new MenuItem("Change Backround Color");
        MenuItem menuItem4 = new MenuItem("Exit");

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3, menuItem4);
        HBox myHbox = new HBox(menuButton);
        BackgroundFill background_fill = new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        myHbox.setBackground(background);

        menuItem1.setOnAction(event ->{
            primaryStage.setScene(dateScene(myHbox, background));
        });

        menuItem2.setOnAction(event ->{
            primaryStage.setScene(textScene(myHbox, background));
        });

        menuItem3.setOnAction(event ->{
            primaryStage.setScene(colorScene(myHbox));;
        });

        menuItem4.setOnAction(event ->{
            primaryStage.close();
        });

        Scene scene = new Scene(myHbox, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Scene dateScene(HBox x, Background y){
        //Makeing a new gridpane
        GridPane root = new GridPane();

        //Adding some spacing to the gridpane
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setHgap(20);
        root.setVgap(20);

        //Getting the Date and Time
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
        Date today = new Date();
        Label nowTime = new Label(formatter.format(today));

        //setting color
        x.setBackground(y);
        root.setBackground(y);

        //Positioning the elements
        root.add(x, 0, 0);
        root.add(nowTime, 0, 1);

        //Return the new Scene
        return new Scene(root, 250, 200);
    }

    public Scene textScene(HBox x, Background y) {
        //Makeing a new gridpane
        GridPane root = new GridPane();

        //Adding some spacing to the gridpane
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setHgap(20);
        root.setVgap(20);

        //Making a new text feild and button
        TextField inputField;
        Button sButton;

        //Setting up the text feild
        inputField = new TextField(); 
        inputField.setPrefColumnCount(15);
        inputField.setEditable(true);
        inputField.setText("");

        //Setting up the button
        sButton = new Button("Save Text");

        //Giving the button something to do
        sButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String newText;
                newText = inputField.getText();
                try {
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("module3.txt", true)));
                    out.println(newText);
                    out.close();
                    inputField.setText("");
                } catch (Exception e) {
                    System.out.println("Something Went Wrong try again.");
                }
            }
        });

        //setting color
        x.setBackground(y);
        root.setBackground(y);

        //Positioning the elements
        root.add(x, 0, 0);
        root.add(inputField, 0, 1);
        root.add(sButton, 0, 2);

        //Return the new Scene
        return new Scene(root, 250, 200);
    }

    public Scene colorScene(HBox x){
        //Makeing a new gridpane
        GridPane root = new GridPane();

        //Adding some spacing to the gridpane
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setHgap(20);
        root.setVgap(20);

        //Seting up RGB
        int r = 255;
        int g;
        int b = 0;

        //getting a random shade of orange
        int min = 120;
		int max = 200;
		Random random = new Random();
        g = random.nextInt(max - min) + min;

        // y = Color.rgb(r, g, b);

        Label thisColor = new Label("This color is rgb(255, " + g + ", 0)");

        BackgroundFill background_fill = new BackgroundFill(Color.rgb(r, g, b), CornerRadii.EMPTY, Insets.EMPTY);
        Background background = new Background(background_fill);
        x.setBackground(background);
        root.setBackground(background);

        //Positioning the elements
        root.add(x, 0, 0);
        root.add(thisColor, 0, 1);

        //Return the new Scene
        return new Scene(root, 250, 200);
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}