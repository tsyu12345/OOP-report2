package Zoog_Obj;

import processing.core.*;

public class SecondZoog extends Zoog{
    public SecondZoog(PApplet pa) {
        super(pa);
        colorBW = 255;
    }
    @Override
    public void move() {//moveメソッドをオーバーライドする。
        if(x < 10 || x > p.width) {
            mx *= -1;
        }
        if(y < 50 || y > p.height - 55) {
            my *= -1;
        }
        x += mx;//zoogを動かす
        y += my;
    }
}
