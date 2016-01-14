
// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape {
	public int xTitle;
	public int yTitle;
	public String name;
	public int xDesc;
	public int yDesc;
	public String Desc;

	public Shape3Octagon() {
		this.xTitle = 25;
		this.yTitle = 325;
		this.name = "Octagon";
		this.xDesc = 125;
		this.yDesc = 575;
		this.Desc = "A octagon has 8 sides";
	}

	public void drawShape(Graphics g) {
		Polygon octagon = new Polygon();
		octagon.addPoint(100, 450);
		octagon.addPoint(100, 500);
		octagon.addPoint(150, 550);
		octagon.addPoint(200, 550);
		octagon.addPoint(250, 500);
		octagon.addPoint(250, 450);
		octagon.addPoint(200, 400);
		octagon.addPoint(150, 400);
		g.setColor(Color.black);
		g.fillPolygon(octagon);
	}

	public void displayName(Graphics g) {
		g.drawString(name, xTitle, yTitle);
	}

	public void displayNumSides(Graphics g) {
		g.drawString(Desc, xDesc, yDesc);
	}
}
