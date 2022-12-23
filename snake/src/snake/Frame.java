package snake;
import java.awt.Color;
import  java.util.Random;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Frame extends JFrame implements KeyListener {
	public Random r = new Random();
	public SnakeHead s = new SnakeHead(50,50, 50, 50, Color.GREEN);
	public Apple a = new Apple(100,100,50,50,Color.RED);
	public Frame() {
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.BLUE);
		this.setVisible(true);
		this.addKeyListener(this);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);}
		
		/*
		Timer t = new Timer(100, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//move snake - body - check for bounds- check for apple - repaint
			}
		}
		*/

	@Override
	public void keyTyped(KeyEvent e) {
	
	
			
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			s.posY=s.posY-50;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_A) {
			s.posX=s.posX-50;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_S) {
			s.posY=s.posY+50;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_D) {
		s.posX=s.posX+50;
		
		}
		
		if(s.eat(a) == true) {
			a.posX= r.nextInt(10)*50;
			a.posY=r.nextInt(10)*50;
			s.body.add(new Point(0,0));
		}
		
		repaint();
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(a.posX, a.posY, 50, 50);
		g.setColor(Color.GREEN);
		g.fillRect(s.posX, s.posY, 50, 50);
		for(Point p:s.body) {
			g.fillRect(p.x, p.y, 50, 50);
	}
}
}

