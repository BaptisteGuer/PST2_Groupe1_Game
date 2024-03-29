package application;
	
import application.view.accueilController;
import application.view.finPartieController;
import application.view.gameController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	
	public static int width = 1280;
	public static int height = 720;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			//gameController.primaryStage = primaryStage;
			//finPartieController.primaryStage = primaryStage;
			accueilController.primaryStage = primaryStage;
			root = FXMLLoader.load(getClass().getResource("view/Jeu - Accueil.fxml"));
			Scene scene = new Scene(root,width,height);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setResizable(false);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
