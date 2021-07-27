package myprogram.Zoog_Obj;
import processing.core.*;

public class NewCharactor extends Zoog{
    private boolean moving = true;
    private boolean draw_text = false;
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
        if(leftEye) {
            p.ellipse((x-30)-10, y, 15, 20);
        }
        if(rightEye) {
            p.ellipse((x-30)+10, y, 15, 20);
        }
        if(draw_text) {
            displayText("HEY!!Mr.Kitahara!!.How are you ??.", 60);
        }
        //leg
        //p.line(x+10, y+20, (x+50)-20, (y+20)+40);
        //p.line(x+40, y+20, (x+50)+20, (y+20)+40);
    }

    public void move(){
        if(moving) {
            if(x <= 0) {
                x = p.width;
            } else {
                x -= 3 * mx;
            }
        }
    }

    private void displayText(String text, int size) {
        p.textAlign(p.CENTER);
        p.textSize(size);
        p.fill(170, 20, 20);
        p.text(text, x, y + 20);
    }

    public void judgeClick(int MouseX,int MouseY) {
        mx = 0;

        draw_text = true;
    }
}
