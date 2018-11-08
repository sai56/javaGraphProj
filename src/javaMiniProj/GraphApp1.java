package javaMiniProj;

import javax.swing.*;
import java.awt.*;


public class GraphApp1 extends JFrame {
	double x,y;
	int choice;
	public GraphApp1(int a){
	
		setTitle("Graph App");
		setResizable(false);		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x=0.0;
		y=0.0;
		choice = a;

	}
	
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawLine(350,0,350,700);
		g.drawLine(0,350,700,350);
		g.setColor(Color.blue);
		g.fillOval((int)x,(int)y,2,2);
		run();
		repaint();
	}

	public void run (){
	
		
		try{
			Thread.sleep(10);			
			double ax,by;
			ax = x-350.0;
			by = y-350.0;
			
			switch(choice){
				
				case 1:
					by = ax;	
					break;
				case 2:
					by = 0.002*ax*ax;
					break;
				case 3:
					by = 0.00001*ax*ax*ax;
					break;
				case 4:
					by = 40*Math.sin(0.1*ax/3.142);
					break;
				case 5:
					by = 40*Math.cos(0.1*ax/3.142);
					break;
				case 6:
					by = 70*Math.tan(0.1*ax/3.142);	
					break;			
				case 7:
					by = 0.01*Math.exp(0.5*ax);
					break;
				case 8:
					by = 10*Math.log(1*ax);
					break;
				default:
					System.exit(0);
			}

			x=ax+350.0;
			y=350.0-by;
			x++;
			
		}catch(Exception e){
			System.out.println("The program has encountered an unexpected response and hence is quiting.");
		}
	}
}
