import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class BoucingBall15 extends PApplet {

//Stacy Gee, CP1 6-7, Bouncing Ball
//URL: http://gangstastacy.webs.com/BouncingBall15.html
Balloon newBalloon = new Balloon();
public void setup()
{
  size(400,300);
}
public void draw()
{
  background(0);
        int r = PApplet.parseInt(random(0,255));
int g = PApplet.parseInt(random(0,255));
int b = PApplet.parseInt(random(0,255));
  stroke(b,g,r);
  line(10,10,390,10); //top horizontal
  line(10,10,10,290); //left vertical
  line(390,10,390,290); //right vertical
  line(10,290,390,290); //bottom horizontal
  newBalloon.bounce();
  newBalloon.move();
  newBalloon.show();
}
class Balloon
{
  int x,y;
  boolean MoveRight,MoveDown;
  Balloon()
  {
    x = 200;
    y = 100;
    MoveRight = true;
    MoveDown = true;
  }
  public void move()
  {
    if(MoveRight == true)
    {
      x++;
    }
    if(MoveRight == false)
    {
      x--;
    }
    if(MoveDown == true)
    {
      y++;
    }
    if(MoveDown == false)
    {
      y--;
    }
  }
  public void bounce()
  {
    if(x < 25)
    {
      MoveRight = true;
    }
    if(y < 25)
    {
      MoveDown = true;
    }
    if(y > 275)
    {
      MoveDown = false;
    }
    if(x > 375)
    {
      MoveRight = false;
    }
  }
  public void show()
  {
    int r = PApplet.parseInt(random(0,255));
    int g = PApplet.parseInt(random(0,255));
    int b = PApplet.parseInt(random(0,255));
    fill(r,g,b);
    frameRate(100);
    ellipse(x,y,30,30);
  }
}


  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#ECE9D8", "BoucingBall15" });
  }
}
