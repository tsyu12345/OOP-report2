package myprogram.Zoog_Obj;
import processing.core.*;

abstract class Zoog implements Charactor{
    public PApplet p;
    protected float x, y;
    protected float mx, my;
    protected int colorBW;
    protected boolean rightEye = true;
    protected boolean leftEye = true;
   
    public Zoog(PApplet pa) {
        p = pa;
        x = p.random(100, 200);
        y = p.random(100, p.height / 2);
        mx = p.random(1, 3);
        my = p.random(1, 3);
        
    }

    public void draw() {

        //zoog body
        p.stroke(0);
        p.fill(colorBW);
        p.rect(x, y, 20, 100);
        //zoog head
        p.fill(colorBW);
        p.ellipse(x, y-30, 60, 60);
        //zoog eye
        p.fill(0);
        if(leftEye == true) {
          p.ellipse(x-19, y-30, 16, 32);
        }
        if(rightEye == true) {
          p.ellipse(x+19, y-30, 16, 32);
        }
        p.fill(0);
        //zoog leg
        p.stroke(0);
        p.line(x-10, y+50, x-20, y + 60);
        p.line(x+10, y+50, x+20, y + 60);
    }

   //public void move();//抽象メソッド

   /*
    public void move() {//zoogを動かすメソッド
        if(x + 20 >= p.width + 20 || x < 0) {//zoogがウィンドウの端に来た際に跳ね返る動作を行う
            mx *= -1;
        }
         x += mx;//zoogを動かす

        if(leftEye == false && rightEye == false) {
           mx = 0;
        }
    }
   */
    
    public void judgeClick(int MouseX, int MouseY) {
    if( (MouseX > x-27 &&  MouseX < x-11)  && (MouseY > y-46 && MouseY < y-14) ) {
      leftEye = false;
    }
    if( (MouseX > x+11 && MouseX < x+27) && (MouseY > y-46 && MouseY < y-14) ) {
      rightEye = false;
    }
  }

   public boolean isInRange(int MouseX, int MouseY) {
      return (p.dist(MouseX, MouseY, x-19, y-30) < 16 || p.dist(MouseX, MouseY, x-19, y-30) < 40 ) ;
   }
}
