import processing.core.*;
import myprogram.Zoog_Obj.*;
import javax.naming.directory.SearchControls;

public class MyApplet extends PApplet{
    HorizontalZoog zoog1;
    SecondZoog zoog2;
    NewCharactor ch1;
    
    public void settings() {
        size(800, 400);
        zoog1 = new HorizontalZoog(this);
        zoog2 = new SecondZoog(this);
        ch1 = new NewCharactor(this);
    }

   public void setup() {
      ellipseMode(CENTER);
      rectMode(CENTER);
   }

    public void draw() {
       background(255);
        zoog1.draw();
        zoog1.move();
        zoog2.draw();
        zoog2.move();
        ch1.draw();
        ch1.move();
    }

   public void mouseClicked() {
      zoog1.judgeClick(mouseX, mouseY);
      zoog2.judgeClick(mouseX, mouseY);
      ch1.judgeClick(mouseX, mouseY);
     
      
   }

    public static void main(String[] args) {
        PApplet.main("MyApplet");
    }

   
}
