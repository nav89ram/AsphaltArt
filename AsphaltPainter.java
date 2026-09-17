import org.code.neighborhood.*;

public class AsphaltPainter extends PainterPlus {
  /* Gets the painter to point (16,16) on the grid
    and starts to create a for loop to do so */
  public void getToCenter() {
    for(int i = 0; i < 17; i++) {
      move();
    }
    turnRight();
    for(int i = 0; i < 17; i++) {
      move();
    }
  }
 /* Creates a full white background
    using loops and conditionals */
  public void whiteBackground() {
    while(canMove()) {
      paint("white");
      move();
      if(!canMove("East")) {
        turnRight();
      }
      if(!canMove("West")) {
        turnLeft();
      }
    }
  }
  // Goes to the center of the map
  public void resetToCenter() {
    while(canMove()) {
      move();
    }
  }

}