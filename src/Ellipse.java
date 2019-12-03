import java.awt.*;

public class Ellipse extends Shape{

    int x;
    int y;
    int width;
    int height;

    public int getX() {return this.x; } //Lấy tung độ

    public void setX(int x) {
        this.x = x;
    } //Cập nhật lại tung độ

    public int getY() {
        return this.y;
    } // Lấy tung độ

    public void setY(int y) {
        this.y = y;
    } //Cập nhật tung độ

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Ellipse(){

    }

    public void Ellipse(int x1, int y1, int x2, int y2, Color fillColor){
        this.x = x1;
        this.y = y1;
        this.width = Math.abs(x1 - x2);
        this.height = Math.abs(y1 - y2);
        this.fillColor = fillColor;
    }


    public void draw(Graphics g){
        if (!this.selected) {
        //    ((Graphics2D)g).setComposite(AlphaComposite.getInstance(3));
            g.setColor(this.fillColor);
            g.fillOval(this.x - this.width, this.y - this.height, this.width * 2, this.height * 2);
        } else {
        //    ((Graphics2D)g).setComposite(AlphaComposite.getInstance(3, 0.4F));
            g.setColor(Color.LIGHT_GRAY);
            g.drawOval(this.x - this.width, this.y - this.height, this.width * 2, this.height * 2);
        }
    }

    public void resize(){

    }
}
