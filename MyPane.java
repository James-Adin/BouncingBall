package cn.zjnu.panes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;

public class MyPane extends Pane {
	// variables
		private BackgroundImage  bgImage;	
		private ImageView iv1;
		private ImageView iv2;	
		private ImageView player;
		
		
		//setters and getters
		public ImageView getPlayer() {
			return player;
		}
		public void setPlayer(ImageView player) {
			this.player = player;
		}
		
		
		
		public ImageView getIv1() {
			return iv1;
		}
		public void setIv1(ImageView iv1) {
			this.iv1 = iv1;
		}
		public ImageView getIv2() {
			return iv2;
		}
		public void setIv2(ImageView iv2) {
			this.iv2 = iv2;
		}
		//constructors
		public MyPane() {
			init();
		}
		
		
		//methods
		private void init() {
			bgImage = new BackgroundImage(new Image("images/bg0.jpg"),BackgroundRepeat.REPEAT,BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT);
		    this.setBackground(new Background(bgImage));
		    
		    this.player = new ImageView(new Image("images/wujin_17.png"));
		    this.player.setLayoutX(550);
		    this.player.setLayoutY(300);
		    
		    this.iv1 = this.player;
		    this.iv2 = new ImageView(new Image("images/wujin_17right.png"));
		    this.iv2.setVisible(false);
		    
		    this.getChildren().add(player);
		    
		    
		
		
		}
	
}
