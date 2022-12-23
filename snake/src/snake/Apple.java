package snake;
import java.awt.Color;

public class Apple {
	//attributes should be private and updated/acccessed with getters and setters
	int posY;
	int posX;
	int height;
	int width;
	Color c;
	
	public Apple(int posY, int posX, int height,int width, Color c) {
		this.posY = posY;
		this.posX = posX;
		this.height = height;
		this.width = width;
		this.c = c;
		
	}
	
	/*
	public void setPosX(int x){
		posX = x;
	}
	
	public int getPosX(){
		return posX;
	}
	*/
	
	
}
