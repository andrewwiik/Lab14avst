
// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape {
	public int xTitle;
	public int yTitle;
	public String name;
	public int xDesc;
	public int yDesc;
	public String Desc;
	
	public Shape2Triangle() {
		this.xTitle = 425;
		this.yTitle = 35;
		this.name = "Triangle";
		this.xDesc = 535;
		this.yDesc = 275;
		this.Desc = "A triangle has 3 sides";
	}

	public void drawShape(Graphics g) {
		Polygon triangle = new Polygon();
		triangle.addPoint(600, 100);
		triangle.addPoint(500, 250);
		triangle.addPoint(700, 250);
		g.setColor(Color.black);
		g.fillPolygon(triangle);
	}

	public void displayName(Graphics g) {
		g.drawString(name, xTitle, yTitle);
	}

	public void displayNumSides(Graphics g) {
		g.drawString(Desc, xDesc, yDesc);
	}
}
