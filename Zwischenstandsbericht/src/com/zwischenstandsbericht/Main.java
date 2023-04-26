package com.zwischenstandsbericht;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.swing.JFrame;

public class Main extends Thread{
	
	JFrame jframe;
	
	String pathToData = "";
	
	
	
	
	
	public Main() {
		try {
			pathToData = new File(URLDecoder.decode(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "/..", "UTF-8")).getAbsolutePath();
		} catch (UnsupportedEncodingException e2) {
			e2.printStackTrace();
		}
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
	
	
	public String getPathToData() {
		return pathToData;
	}

}
