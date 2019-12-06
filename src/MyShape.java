import java.awt.*;
import java.awt.Shape;

public abstract class MyShape implements DrawShape{
	public MyShape(){
	};

	@Override 
	public void paint(){
		System.out.println("paint");
	};

	@Override
	public void setLocation(){
		System.out.println("set location");
	};

	@Override
	public void setSize(){
		System.out.println("set Size");
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

}
