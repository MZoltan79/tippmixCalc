package application;
	
import java.io.IOException;

import animatefx.animation.FadeIn;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideOutLeft;
import animatefx.animation.ZoomIn;
import application.view.CombiLayoutController;
import application.view.InfoLayoutController;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;



public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane root;
	private BorderPane rightPane;
	private Button combButton;
	private Button specCombButton;
	private Button helpButton;
	private Button exitButton;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TippMix nyeremény kalkulátor");
		initMainWindow();
		helpButton.setOnAction(e -> showInfoLayout());
		combButton.setOnAction(e -> showCombiLayout());
		exitButton.setOnAction(e -> Platform.exit());
	}
	
	public Main() {
		
	}
	
	public void initMainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/MainWindow.fxml"));
			root = (AnchorPane)loader.load();
			primaryStage.setResizable(false);
			combButton = (Button) loader.getNamespace().get("combinationButton");
			specCombButton =(Button) loader.getNamespace().get("specCombButton");
			helpButton = (Button) loader.getNamespace().get("helpButton");
			exitButton = (Button) loader.getNamespace().get("exitButton");
			rightPane = (BorderPane) loader.getNamespace().get("rightPane");
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			FadeIn fade = new FadeIn(root);
			fade.setSpeed(0.3);
			fade.play();
			mouseMovedOverButton(combButton);
			mouseMovedOverButton(specCombButton);
			mouseMovedOverButton(helpButton);
			mouseMovedOverButton(exitButton);
			buttonPressed(combButton);
			buttonPressed(specCombButton);
			buttonPressed(helpButton);
			showInfoLayout();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showInfoLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/InfoLayout.fxml"));
			AnchorPane infoPane = loader.load();
			rightPane.setCenter(infoPane);
			TextArea infoArea = (TextArea) loader.getNamespace().get("infoArea");
			InfoLayoutController controller = loader.getController();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void showCombiLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/CombiLayout.fxml"));
			AnchorPane combiPane = loader.load();
			rightPane.setCenter(combiPane);
			Button countButton = (Button) loader.getNamespace().get("countButton");
			Button addOddsButton = (Button) loader.getNamespace().get("addOddsButton");
			mouseMovedOverButton(countButton);
			mouseMovedOverButton(addOddsButton);
			CombiLayoutController controller = loader.getController();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void mouseMovedOverButton(Button btn) {
		final ZoomIn zoomIn = new ZoomIn(btn);
		zoomIn.setSpeed(0.7);
		btn.setOnMouseEntered(e -> zoomIn.play());
	}
	
	public void buttonPressed(Button btn) {
		final SlideInLeft slideIn = new SlideInLeft(btn);
		final SlideOutLeft slideOut = new SlideOutLeft(btn);
		KeyFrame kf1 = new KeyFrame(Duration.seconds(0), e -> slideOut.play());
		KeyFrame kf2 = new KeyFrame(Duration.seconds(1), e -> slideIn.play());
		Timeline tl = new Timeline(kf1, kf2);
		btn.setOnMouseClicked(e -> tl.play());
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
