package myprogram.Zoog_Obj;
import processing.core.*;

public class NewCharactor implements Charactor{
    
    private PApplet p; 
    private boolean moving = true;
    private boolean draw_text = false;
    private float x, y, mx;
    private boolean rightEye = true;
    private boolean leftEye = true;


    public NewCharactor(PApplet pa) {
        //super(pa);
        p = pa;
        x = p.random(100, 200);
        y = p.random(100, p.height / 2);
        mx = p.random(1, 3);
        //my = p.random(1, 3);
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
    public boolean isInRange(int MouseX, int MouseY){
        return (p.dist(MouseX, MouseY, x-19, y-30) < 16 || p.dist(MouseX, MouseY, x-19, y-30) < 40 ) ;
    }
    
    public void judgeClick(int MouseX,int MouseY) {
        mx = 0;
        draw_text = true;
    }
}
