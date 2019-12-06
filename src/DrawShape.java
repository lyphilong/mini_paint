import java.awt.*;


public interface DrawShape{
	public void paint();

	public void setLocation();

	public void setSize();

	public Shape intersect();

	public Shape add();

	public Shape subtract();
}
