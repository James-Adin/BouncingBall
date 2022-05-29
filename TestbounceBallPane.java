package cn.zjnu.demos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class TestbounceBallPane extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// 1.Create a ball pane
		BallPane bp = new BallPane();
		
		bp.setOnMousePressed(e->bp.pause());
		bp.setOnMouseReleased(e->bp.play());
		
		
		bp.setOnKeyPressed(e->{
			if(e.getCode()== KeyCode.UP) {
				bp.increaseSpeed();
			}else if(e.getCode()==KeyCode.DOWN) {
				bp.decreaseSpeed();
			}
		});
		
		Scene scene = new Scene(bp,400,300);
		stage.setTitle("Bounce Ball");
		stage.setScene(scene);
		stage.show();
		
		
		bp.requestFocus();

	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
