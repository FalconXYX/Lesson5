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
        this.g = g;
        diameter = 100;
        facecolor = Color.red;
        eyecolor = Color.yellow;
        ishappy = true;
    }

    public void draw() {
        drawHead(facecolor, xPos, yPos);
        drawEyes(eyecolor);
        drawMouth();
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

    public void move(int mx, int my) {
        if (mx > 0 && mx < 700 || my > 0 && my < 426) {
            xPos = mx;
            yPos = my;
        } else {
            System.out.println("Invalid move");
        }
    }

    public void setfacecolor(Color c) {
        facecolor = c;
    }

    public void seteyecolor(Color c) {
        eyecolor = c;

    }

    public void setd(int d) {
        diameter = d;

    }

    public void togglemood() {
        if (ishappy == true) {
            ishappy = false;
        } else {
            ishappy = true;
        }
    }

    private void drawHead(Color c, int x, int y) {
        g.setColor(c);
        g.fillOval(xPos, yPos, diameter, diameter);

    }

    private void drawEyes(Color c) {
        g.setColor(c);
        g.fillOval(xPos + 2 * (diameter / 6), yPos + (diameter / 6), diameter / 10, diameter / 10);
        g.fillOval(xPos + (4 * (diameter / 6)), yPos + (diameter / 6), diameter / 10, diameter / 10);

    }

    private void drawMouth() {
        int x1 = xPos + 2 * (diameter / 6);
        int x2 = xPos + (4 * (diameter / 6));
        int y1 = yPos + (4 * (diameter / 6));
        g.drawLine(x1, y1, x2, y1);
        if (ishappy) {
            g.drawLine(x1, y1, x1 - diameter / 12, y1 - diameter / 12);
            g.drawLine(x2, y1, x2 + diameter / 12, y1 - diameter / 12);

        } else {
            g.drawLine(x1, y1, x1 - diameter / 12, y1 + diameter / 12);
            g.drawLine(x2, y1, x2 + diameter / 12, y1 + diameter / 12);
        }

    }
}
