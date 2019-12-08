import java.awt.*;
import java.awt.geom.Area;


public interface DrawShape{
	public void paint(Graphics2D g);

	public void setLocation(Point location);

	public void setSize(Dimension size);

	public Shape intersect();

	public Shape add();

	public Shape subtract();

	public Rectangle getRect();

	public Point getLocation();
}
