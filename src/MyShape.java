import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Area;

public abstract class MyShape implements DrawShape{
	Rectangle rect;
	public MyShape(){
		rect = new Rectangle();
	};

	@Override 
	public void paint(Graphics2D g){
		System.out.println("paint");
		g.draw(rect);
	};

	@Override
	//TODO: It not change the location
	public void setLocation(Point location){
		System.out.println("set location");
		rect.setLocation(location); //Does it change the area location
	};

	@Override
	public void setSize(Dimension size){
		System.out.println("set Size");
		rect.setSize(size);
	};

	@Override
	public Shape intersect(){
		System.out.println("intersect");
		return null;
	};

	@Override
	public Shape add(){
		System.out.println("add");
		return null; 
	};

	@Override
	public Shape subtract(){
		System.out.println("Subtract");
		return  null;
	};

	@Override
	public Rectangle getRect(){
		return(this.rect);
	};

	public Point getLocation(){
		return(rect.getLocation());
	};

}
