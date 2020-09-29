package face;

import java.awt.Color;
import java.awt.Graphics;

public class Face {

    private int xPos, yPos, diameter;
    private Color facecolor, eyecolor;
    private Graphics g;
    boolean ishappy;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;
        
        diameter = 100;
        facecolor = Color.red;
        eyecolor = Color.yellow;
        ishappy = true;
    }

    public void draw() {
        drawHead(facecolor,xPos,yPos);
        drawEyes(eyecolor);
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

    public void setfacecolor(Color c) {
        g.setColor(c);
        facecolor = c;
    }
    public void seteyecolor(Color c) {
        g.setColor(c);
        eyecolor = c;
        
    }

    public void togglemood(Color c) {
        if (ishappy == true) {
            ishappy = false;
        } else {
            ishappy = true;
        }
    }
    private void drawHead(Color c, int x, int y) {
               
       
    }
    private void drawEyes(Color c) {
        
       
    }
    private void drawMouth() {
        
       
    }
}
