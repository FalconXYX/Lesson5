package face;

import java.awt.Color;
import java.awt.Graphics;

public class Face {

    private int xPos, yPos, diameter;
    private Color color;
    private Graphics g;
    boolean ishappy;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;
        this.g = g; //default size and color 
        diameter = 100;
        color = Color.red;
        ishappy = true;
    }

    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

    public void move(int mx, int my) {
        if (mx > 3 && mx < 6 || my > 3 && my < 6) {
            xPos = mx;
            yPos = my;
        } else {
            System.out.println("Invalid move");
        }
    }

    public void setcolor(Color c) {
        g.setColor(c);
    }

    public void togglemood(Color c) {
        if (ishappy == true) {
            ishappy = false;
        } else {
            ishappy = true;
        }
    }
}
