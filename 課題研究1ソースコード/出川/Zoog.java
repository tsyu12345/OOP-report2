import processing.core.*;

class Zoog {
   private PApplet p;
   private int x, y, step;
   private boolean rightEye = true;
   private boolean leftEye = true;
  
   Zoog(PApplet pa, int x0, int y0, int step0) {
      p = pa;
      x = x0;
      y = y0;
      step = step0;
   } 
  
   void drawZoog() {
     p.stroke(0);
     p.fill(150);
     p.rect(x, y, 20, 100);
    
     p.fill(255);
     p.ellipse(x, y-30, 60, 60);
    
     p.fill(0);
     if(leftEye == true)  {
       p.ellipse(x-19, y-30, 16, 32);
     }
     if(rightEye == true) {
       p.ellipse(x+19, y-30, 16, 32);
     }
    
     p.stroke(0);
     p.line(x-10, y+50, x-20, y+60);
     p.line(x+10, y+50, x+20, y+60);
  }
  
  void move() {
    x += step;
    
    if(x + 30 > p.width || x - 30 < 0) {
      step *= -1;
    }
    
    if(leftEye == false && rightEye == false) {
      step = 0;
    }
  }

   void move2() {
      y += step;
      
      if(y + 60 > p.height || y - 60 < 0) {
        step *= -1;
      }
    
      if(leftEye == false && rightEye == false) {
        step = 0;
      }
   }
  
  void judgeClick(int MouseX, int MouseY) {
    if( (MouseX > x-27 &&  MouseX < x-11)  && (MouseY > y-46 && MouseY < y-14) ) {
      leftEye = false;
    }
    if( (MouseX > x+11 && MouseX < x+27) && (MouseY > y-46 && MouseY < y-14) ) {
      rightEye = false;
    }
  }

   boolean isInRange(int MouseX, int MouseY) {
      return ((MouseX > x-27 &&  MouseX < x-11)  && (MouseY > y-46 && MouseY < y-14)) || ( (MouseX > x+11 && MouseX < x+27) && (MouseY > y-46 && MouseY < y-14) ) ;
   }

   int getX() {
      return x;
   }

   int getY() {
      return y;
   }
}
