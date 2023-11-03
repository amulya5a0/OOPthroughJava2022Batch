package cseb;
import java.awt.*;
import java.awt.event.*;

class TestOut extends Frame{
	public void paint(Graphics g) {
		//g.setColor(Color.green);
		g.setColor(Color.pink);
		g.drawRect(100,90,200,150);
		g.fillRect(100,90,200,150);
		g.setColor(Color.yellow);
		//this.setBackGroundColor(Color.green);
		//g.drawRect(100,90,200,150);
		g.drawOval(150,120 , 100, 100);
		g.fillOval(150,120 , 100, 100);
		g.setColor(Color.black);
		//g.fillOval(20, 30, 100, 50);
		//g.clearRect(0, 0, 0, 0);
		g.drawOval(170,135,10,15);
		g.drawOval(210,135,20,15);
		g.fillOval(170,135,20,20);
		g.fillOval(210,135,20,20);
		g.setColor(Color.black);
		g.drawLine(200,160,200,180);
		g.fillArc(180,175,40,15,180,180);
		//this.setBackGroundColor(BackGroundColor.green);
	}
}
public class FirstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOut f = new TestOut();
			  f.setVisible(true);
			  f.setSize(400,400);
			  f.addWindowListener(new MyClass());
			
				  
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}