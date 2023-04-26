package com.zwischenstandsbericht.objects;

import java.awt.Graphics;

//2
public abstract class ZSBObject {
	
	int x, y;
	
	abstract void draw(Graphics g);
	
	abstract int getX();
	abstract int getY();
	
	

	
}
