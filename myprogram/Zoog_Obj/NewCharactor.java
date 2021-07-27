package myprogram.Zoog_Obj;
import processing.core.*;

public class NewCharactor extends Zoog{
    public NewCharactor(PApplet pa) {
        super(pa);
    }
    
    public void draw() {
        //body
        p.fill(190);
        p.rect(x, y, 100, 20);
        //head
        p.fill(100);
        p.ellipse(x-30, y, 60, 60);
        //eye
        p.fill(0);
        p.ellipse((x-30)-10, y, 15, 20);
        p.ellipse((x-30)+10, y, 15, 20);
        //leg
        p.line(x+10, y+20, (x+50)-20, (y+20)+40);
        p.line(x+40, y+20, (x+50)+20, (y+20)+40);
    }

    public void move(){}
}
