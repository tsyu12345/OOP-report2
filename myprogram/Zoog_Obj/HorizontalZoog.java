package myprogram.Zoog_Obj;

import processing.core.*;

public class HorizontalZoog extends Zoog {
   public HorizontalZoog(PApplet pa) {
      super(pa);
      
      colorBW = (int)p.random(1, 255);
   }

    public void move() {//moveメソッドをオーバーライドする
        if(x + 20 >= p.width + 20 || x < 0) {//zoogがウィンドウの端に来た際に跳ね返る動作を行う
            mx *= -1;
        }
         x += mx;//zoogを動かす

        if(leftEye == false && rightEye == false) {
           mx = 0;
        }
    }

}

   
