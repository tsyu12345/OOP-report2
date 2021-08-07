import processing.core.*;
import Zoog_Obj.Zoog;
import javax.naming.directory.SearchControls;
import Zoog_Obj.SecondZoog;

public class MyApplet extends PApplet{
    Zoog zoog1;
    SecondZoog zoog2;
    
    public void settings() {
        size(800, 400);
        zoog1 = new Zoog(this);
        zoog2 = new SecondZoog(this);
    }

    public void draw() {
        zoog1.drawZoog();
        zoog1.move();
        zoog2.drawZoog();
        zoog2.move();
    }
    public static void main(String[] args) {
        PApplet.main("MyApplet");
    }
}

