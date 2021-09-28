package TurtleGraphics;

public class Pen {
  private PenPosition penPosition = PenPosition.UP;
//  or import by first removing PenPosition leaving only UP
    public PenPosition getPosition(){
        return penPosition;
    }

    public void setPosition(PenPosition currentPosition){
        penPosition = currentPosition;
    }
}

-------
        package TurtleGraphics;

        import static TurtleGraphics.PenPosition.UP;

public class Pen {

    private PenPosition penPosition = UP;
//    public  Pen(){
//        penPosition = PenPosition.UP;
//    }

    public PenPosition getPosition() {
        return penPosition;
    }

    public void setPosition(PenPosition currentPosition) {
        penPosition = currentPosition;
    }
}
