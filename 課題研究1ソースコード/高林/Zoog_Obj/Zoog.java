package Zoog_Obj;

import processing.core.*;

public class Zoog {
    public PApplet p;
    protected float x, y;
    protected float mx, my;
    protected int colorBW;
    public Zoog(PApplet pa) {
        p = pa;
        x = p.random(100, 200);
        y = p.random(100, p.height / 2);
        mx = p.random(1, 3);
        my = p.random(1, 3);
        colorBW = (int)p.random(1, 255);
    }

    public void drawZoog() {
        p.background(255);
        p.rectMode(p.CENTER);
        //zoog body
        p.stroke(0);
        p.fill(colorBW);
        p.rect(x, y, 20, 100);
        //zoog head
        p.fill(colorBW);
        p.ellipse(x, y-30, 60, 60);
        //zoog eye
        p.fill(0);
        mouseClicked(x, y, mx, my);
        p.ellipse(x-19, y-30, 16, 32);
        p.ellipse(x+19, y-30, 16, 32);
        p.fill(0);
        //zoog leg
        p.stroke(0);
        p.line(x-10, y+50, x-20, y + 60);
        p.line(x+10, y+50, x+20, y + 60);
    }

    public void move() {//zoogを動かすメソッド
        if(x + 20 >= p.width + 20) {//zoogがウィンドウの端に来た際に跳ね返る動作を行う
            mx *= -1;
        } else if(x == 0) {
          mx *= -1;
        }
         x += mx;//zoogを動かす
      }
    
    protected void mouseClicked(float x, float y, float mx, float my) {
        if(p.dist(p.mouseX, p.mouseY, x-19, y-30) < 16 || p.dist(p.mouseX, p.mouseY, x-19, y-30) < 40){
            if(p.mousePressed){
                p.fill(255);
                p.noStroke();
                mx *= 0;
                my *= 0;
            }
        }
    }
}
