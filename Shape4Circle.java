
// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape {
	public int xTitle;
	public int yTitle;
	public String name;
	public int xDesc;
	public int yDesc;
	public String Desc;

	public Shape4Circle() {
		this.xTitle = 425;
		this.yTitle = 325;
		this.name = "Circle";
		this.xDesc = 550;
		this.yDesc = 550;
		this.Desc = "A circle has 0 sides";
	}

	public void drawShape(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(525, 375, 150, 150);
	}

	public void displayName(Graphics g) {
		g.drawString(name, xTitle, yTitle);
	}

	public void displayNumSides(Graphics g) {
		g.drawString(Desc, xDesc, yDesc);
	}
}
