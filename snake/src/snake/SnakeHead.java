package snake;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;


public class SnakeHead {
	//attributes should be private with methods to access/change them
	//private int posY - public int getPosY(){return posY;}
	int posY;
	int posX;
	int height; 
	int width; 
	Color c; 
	ArrayList<Point>body=new ArrayList();
	public SnakeHead(int posY, int posX, int height,int width, Color c) {
		this.posY = posY;
		this.posX = posX;
		this.height = height;
		this.width = width;
		this.c = c;
	}
	public boolean eat(Apple a) {
		if(a.posY == posY && a.posX == posX) {
			return true;
		}
			return false;
	}
	public void Move() {
	int nextposX = posX;
	int nextposY = posY;
	int tailposY = -10;
	int tailposX = -10;
	
	}{
	for(Point p:body) {
		p.y = posY- 50;
		p.x = posX - 50;
		
		
}
}
}
