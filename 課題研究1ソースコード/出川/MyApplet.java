import processing.core.*;

public class MyApplet extends PApplet {
   private Zoog zoog1;
   private Zoog zoog2;

   public void settings() {
      size(400, 400);
      zoog1 = new Zoog(this, 30, 200, 1);
      zoog2 = new Zoog(this, 200, 300, 1);
   }

   public void setup() {
      ellipseMode(CENTER);
      rectMode(CENTER);
   }

   public void draw() {
      background(255);
      zoog1.drawZoog();
      zoog1.move();
      zoog2.drawZoog();
      zoog2.move2();
   }

   public void mouseClicked() {
      zoog1.judgeClick(mouseX, mouseY);
      zoog2.judgeClick(mouseX, mouseY);
      if(zoog1.isInRange(mouseX, mouseY) ) {
         System.out.println(zoog1.getX()+ ", " + zoog1.getY());
      }
      if(zoog2.isInRange(mouseX, mouseY) ) {
         System.out.println(zoog2.getX()+ ", " + zoog2.getY());
      }
      
   }

   public static void main(String[] args) {
      PApplet.main("MyApplet");
   }
}
