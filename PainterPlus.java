import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  public void turnRight() {
    //Turns right using three turn left lines
    turnLeft();
    turnLeft();
    turnLeft();
  }
  public void takeAllPaint() {
    //note to self could also use a while loop 
    // Code takes all the paint if it is on a bucket
    isOnBucket();
    isOnBucket();
    isOnBucket();
    isOnBucket();
    isOnBucket();
    isOnBucket();
    isOnBucket();
    isOnBucket();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
    takePaint();
  }

  public void moveFast() {
    // The painter will move forward until it reaches an obstacle
    while(canMove()) {
      move();
    }
  }
  public void paintToEmpty(String color) {
    // Uses all the paint in a painters inventory to paint it all out
    while(hasPaint()) {
      paint(color);
      move();
    }
  }
  public void paintDonut(String color) {
    while(hasPaint()) {
      // This paints a circle wherever the painter is
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
  
    
}