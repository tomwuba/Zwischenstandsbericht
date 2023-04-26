package com.zwischenstandsbericht.objects;

import java.awt.Graphics;

//5
public abstract class ZSBObject {
	
	int x, y;
	
	abstract void draw(Graphics g);
	
	abstract int getX();
	abstract int getY();
	
	

	
}
