
// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape {
	public int xTitle;
	public int yTitle;
	public String name;
	public int xDesc;
	public int yDesc;
	public String Desc;

	public Shape1Square() {
		this.xTitle = 25;
		this.yTitle = 35;
		this.name = "Square";
		this.xDesc = 125;
		this.yDesc = 275;
		this.Desc = "A square has 4 sides";
	}

	public void drawShape(Graphics g) {
		{
			g.setColor(Color.black);
			g.fillRect(100, 100, 150, 150);
		}

	}

	public void displayName(Graphics g) {
		g.drawString(name, xTitle, yTitle);
	}

	public void displayNumSides(Graphics g) {
		g.drawString(Desc, xDesc, yDesc);
	}
}
