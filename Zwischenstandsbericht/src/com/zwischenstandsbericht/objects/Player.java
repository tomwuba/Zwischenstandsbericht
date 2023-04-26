package com.zwischenstandsbericht.objects;

import java.awt.Graphics;
import java.awt.Color;

public class Player extends ZSBObject{
    private int x, y;
    private int width = 20, height = 40;

    @Override
    void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, width);
        g.fillRect(x, y + width, width, height - width);
    }

    @Override
    int getX() {
        return 0;
    }

    @Override
    int getY() {
        return 0;
    }
}
