import org.code.neighborhood.*;

public class FirstRing extends AsphaltPainter {
  /* Creates the ouline of the first line
      Also adds as a new subclass and painter */
  public void outline(String color) {
    turnRight();
    for(int i=0; i < 9; i++) {
      move();
    }
    paint(color);
    turnRight();
    for(int i=0;i<6;i++) {
      move();
      paint(color);
    }
    
    for(int i=0;i<2;i++) {
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      
    }
    turnRight();
    for(int i=0;i<7;i++) {
      move();
      paint(color);
      
    }
    for(int i=0;i<2;i++) {
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      
    }
    turnRight();
    for(int i=0;i<7;i++) {
      move();
      paint(color);
    }
    for(int i=0;i<2;i++) {
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      turnLeft();
      move();
      paint(color);
      
    }
    turnRight();
    for(int i=0;i<5;i++) {
      move();
      paint(color);
      
    }
    for(int i=0;i<2;i++) {
      move();
      paint(color);
      
    }
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    
    
  }
}