
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	// declare five buttons, a label, and a textfield
	Button button1 = new Button("Hello");
	Button button2 = new Button("Howdy");
	Button button3 = new Button("Chinese");
	Button button4 = new Button("Clear");
	Button button5 = new Button("Exit");
	Button button6 = new Button("Spanish");
	Font font = Font.font("Cambria", FontWeight.BOLD, 12);

	Label label1 = new Label("Feedback");
	TextField textField = new TextField();

	// declare two HBoxes
	HBox hbox1 = new HBox();
	HBox hbox2 = new HBox();
	VBox vbox = new VBox(40);

	// student Task #4:
	// declare an instance of DataManager

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	public FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		// instantiate the HBoxes

		// student Task #4:
		// instantiate the DataManager instance
		// set margins and set alignment of the components
		HBox.setMargin(button1, new Insets(10));
		HBox.setMargin(button2, new Insets(10));
		HBox.setMargin(button3, new Insets(5));
		HBox.setMargin(button4, new Insets(5));
		HBox.setMargin(button5, new Insets(5));
		HBox.setMargin(button6, new Insets(5));
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		// add the buttons to the other HBox
		// add the HBoxes to this FXMainPanel (a VBox)
		hbox1.getChildren().addAll(button1, button2, button6);
		hbox2.getChildren().addAll(button3, button4, button5, label1, textField);
		getChildren().addAll(hbox1, hbox2);

		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler());
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		button6.setOnAction(new ButtonHandler());


		button3.setWrapText(true);
		button4.setWrapText(true);
		button5.setWrapText(true);
		button6.setWrapText(true);

		
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);
		button5.setFont(font);
		button6.setFont(font);

	}

	// Task #4:
	// create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {

		DataManager dataManager = new DataManager();

		public void handle(ActionEvent event) {
			if (event.getTarget() == button1) {
				textField.setText(dataManager.getHello());
			} else if (event.getTarget() == button2) {
				textField.setText(dataManager.getHowdy());
			} else if (event.getTarget() == button3) {
				textField.setText(dataManager.getChinese());
			} else if (event.getTarget() == button6) {
				textField.setText(dataManager.getSpanish());
			} else if (event.getTarget() == button4) {
				textField.setText("");
			} else if (event.getTarget() == button5) {
				Platform.exit();
				System.exit(0);
			}
		}
	}

}