import java.awt.*;

public class Shape {
    Color color = Color.black;

    public Shape(){
	    System.out.println("Create Shape object");
    }
    public static void draw() {
    }
    public static void fill() {
    }
    public static void resize() {
    }
    public static boolean check_is_pointing() {
        return(true);
    }
    public static void main(String[] args) {
        Shape myObj = new Shape();
        System.out.println(myObj.color);
    }
}
