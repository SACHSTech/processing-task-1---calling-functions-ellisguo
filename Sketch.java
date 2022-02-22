import processing.core.PApplet;
 
public class Sketch extends PApplet {
  
  
 /**
  * Called once at the beginning of execution, put your size all in this method
  */
 public void settings() {
  // put your size call here
   size(400, 400);
 }
 
 /**
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
 public void setup() {
   background(173, 216, 230);
 }
 
 /**
  * Called repeatedly, anything drawn to the screen goes here
  */
 public void draw() {
   
  // sample code, delete this stuff
  
   // feet
   fill(0, 128, 0);
   ellipse(175, 300, 30, 50);
   ellipse(225, 300, 30, 50);
  
   // head
   fill(0, 128, 0);
   ellipse(200, 150, 75, 75);
  
   // mask
   fill(255, 227, 48);
   rect(175, 140, 50, 20); 
  
   // eyes
   fill(0, 0, 0);
   ellipse(190, 150, 10, 10);
   ellipse(210, 150, 10, 10);
  
   // body
   fill(0, 128, 0);
   rect(163, 187, 75, 100);
  
   // arms
   fill(0, 128, 0);
   rect(113, 187, 50, 20);
   rect(238, 187, 50, 20);
  
   // wand
   fill(0, 128, 0);
   line(288, 187, 288, 125);

   // sun 
   fill(225, 225, 45);
   ellipse(40, 40, 20, 20);
  
 }
  // define other methods down here.
}

