import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    /* Creates all the painters nessacary to create the design
      from multiple subclasses */
    AsphaltPainter opticalIllusion = new AsphaltPainter();
    FirstRing first = new FirstRing();
    SecondRing second = new SecondRing();
    thirdRinging third = new thirdRinging();
    // Sets the paint the painter can use 
    opticalIllusion.setPaint(1024);
    // Calls a method from asphaltpainter to create a white background
    opticalIllusion.whiteBackground();
    opticalIllusion.turnLeft();
    opticalIllusion.turnLeft();
    // Goes back to the original spot
    opticalIllusion.resetToCenter();
    opticalIllusion.turnRight();
    // Painter goes to center to start the actual design
    opticalIllusion.getToCenter();
    // Creates the first blue ring
    first.getToCenter();
    first.outline("Blue");
    // Creates the second orange ring
    second.getToCenter();
    second.bottomRight();
    second.outline("Orange");
    // Creates the third black ring
    third.getToCenter();
    third.bottomLeft();
    third.outline("Black");
  }
}