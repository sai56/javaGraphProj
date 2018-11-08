
package javaMiniProj;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaMiniProj.GraphApp1;

public class Selection extends JFrame {

	int ch;
	
	public Selection(){

		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Options for graphs");

		ArrayList<String> options = new ArrayList<String>();
		options.add("1) Line y=x");
		options.add("2) Parabola y=x^2");
		options.add("3) Cubic function y = x^3");
		options.add("4) Sine Function");
		options.add("5) Cosine Function");
		options.add("6) Tangent function");
		options.add("7) Exponential function");
		options.add("8) Logarithmic function");
		options.add("9) Quit");	

		final JList<String> list = new JList(options.toArray());
		
		getContentPane().add(list);

		JButton btn = new JButton("Selected");
		getContentPane().add(btn);
		
		
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae){
				
				int[] actionsToPerform = list.getSelectedIndices();

				ch = actionsToPerform[0];

			}
		});
		setSize(250,250);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			System.out.println("Unexpected behaviour");
		}
		
		new GraphApp1(ch+1);
	}
	
	
	public static void main(String[] args) {
		new Selection();

	}

}
