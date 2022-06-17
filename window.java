import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import java.awt.*;


public class window extends JFrame implements MouseMotionListener,MouseWheelListener,MouseListener{
	private int x=-20;
	private int y=-20;
	private int radius=10;
	private Color color =new Color(0,0,0);
	window(){
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(500,500);
		JPanel panel=new JPanel();
		add(panel);
		panel.setLayout(new FlowLayout());
		add(panel);
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		panel.addMouseWheelListener(this);
		setVisible(true);
		
		}
	public void mouseMoved(MouseEvent e){}
	public void mouseDragged(MouseEvent e){
		x=e.getX();
		y=e.getY();
		repaint();
		}
	public void mouseWheelMoved(MouseWheelEvent e){
		if(e.getWheelRotation()<0){
			radius--;
		}
		if(e.getWheelRotation()>0){
			radius++;
		}
	}
	public void mouseClicked(MouseEvent e){
	if(e.getButton()==MouseEvent.BUTTON3){
		color=new Color((int)Math.random()*255,(int)Math.random()*255,(int)Math.random()*255);	
	}
		repaint();
	}
	public void mouseEntered(MouseEvent e){}
	
	public void mousePressed(MouseEvent e){
		if(e.getButton()==MouseEvent.BUTTON3){
		int r1=(int)(Math.random()*255);
		int r2=(int)(Math.random()*255);
		int r3=(int)(Math.random()*255);
		color=new Color(r1 ,r2,r3);	
	}
		repaint();
	}
	
	public void mouseReleased(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void paint(Graphics g){
		g.setColor(color);
		g.fillOval(x,y,radius,radius);
		
		
	}
	public static void main(String []args){
		window w=new window();
		
	}
	
}




	
	
			
			

