package com.zwischenstandsbericht;

import javax.swing.JFrame;

public class Main extends Thread{
	
	JFrame jframe;
	
	
	
	
	
	public Main() {
		JFrame jframe = new JFrame("Zwischenstandsbericht");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		this.start();
	}
	
	
	@Override
	public void run() {
		while(true) {
			jframe.getContentPane().repaint();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Main();
	}

}
