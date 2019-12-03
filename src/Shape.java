import javax.swing.*;
import java.awt.*;
import java.io.Serializable;


public abstract class Shape extends JComponent implements Serializable {

    protected Color fillColor;
    protected boolean selected;

    public Shape() {
    }

    public void draw(Graphics var1) {}


    public void setColor(Color filColor) {
        this.fillColor = filColor;
    }

    public Color getFillColor(){return this.fillColor;}

    public void resize() {
    }

    public boolean isSelected() {
        return this.selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
