package cn.zjnu.demos;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.awt.Color;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;

public class BallPane extends Pane {
	public final double radius = 20;
	private double x = radius, y = radius;
	private double dx = 1, dy = 1; 
	private Circle circle = new Circle(x,y,radius);
	private Timeline animation;
	
	public BallPane() {
		circle.setFill(javafx.scene.paint.Color.BLUE);
		//circle.setFill(javafx.scene.paint.Color.BLUE);
		this.getChildren().add(circle);
		animation = new Timeline(new KeyFrame(Duration.millis(50),e->moveBall()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}
	protected void moveBall() {
		//check boundary
		if(x < radius || x > this.getWidth() - radius) {
			dx *= -1;
		}
		if(y < radius || y > this.getHeight() - radius) {
			dy *= -1;
		}
		//adjust the position
		x += dx;
		y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	public void play() {
		animation.play();
	}
	public void pause() {
		animation.pause();
	}
	public void stop() {
		animation.stop();
	}
	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 0.1);
	}
	public void decreaseSpeed() {
		animation.setRate(animation.getRate() > 0? animation.getRate() - 0.1:0);
	}
	
	public DoubleProperty rateProperty() {
		return animation.rateProperty();
	}
	
}
