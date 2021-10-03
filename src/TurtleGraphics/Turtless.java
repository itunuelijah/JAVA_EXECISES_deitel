package TurtleGraphics;

//public class Turtle {
//    private Pen pen= new Pen();
//    private Direction currentDirection = EAST;
//    private Position currentPosition
//    public Pen getPen() {
//        return Pen;
//    }
//    public void penDown() {
//        pen.setPosition(PenPosition.DOWN);
//    }
//}
//-------
//        package TurtleGraphics;
//
//public class Turtle {
//
//    private Pen pen = new Pen();
//    private Direction currentDirection = Direction.EAST;
//    private TurtlePosition currentPosition = new TurtlePosition(0, 0);
//
//    public Pen getPen() {
//        return pen;
//    }
//
//    public void penDown() {
////        pen.getPosition().setPosition(PenPosition.DOWN);
////        PenPosition position = pen.getPosition();
////        position.setPosition(PenPosition.DOWN);
//        pen.setPosition(PenPosition.DOWN);
//
//    }
//
//    public void penUp() {
//        pen.setPosition(PenPosition.UP);
//    }
//
//    public Direction getCurrentDirection() {
//        return currentDirection;
//    }
//
//    public void turnRight() {
////        switch (currentDirection){
////            case SOUTH -> changeCurrentDirectionTo(Direction.WEST);
////        }
//        if (currentDirection == Direction.NORTH)
//            changeCurrentDirectionTo(Direction.EAST);
//        else{
//            if (currentDirection == Direction.WEST)
//                changeCurrentDirectionTo(Direction.NORTH);
//            if (currentDirection == Direction.SOUTH)
//                changeCurrentDirectionTo(Direction.WEST);
//            if (currentDirection == Direction.EAST)
//                changeCurrentDirectionTo(Direction.SOUTH);
//        }
//    }
//
//    private void changeCurrentDirectionTo(Direction newDirection){
//        currentDirection = newDirection;
//    }
//
//    public void turnLeft() {
//        if (currentDirection == Direction.SOUTH)
//            changeCurrentDirectionTo(Direction.EAST);
//        else {
//            if (currentDirection == Direction.WEST)
//                changeCurrentDirectionTo(Direction.SOUTH);
//            if (currentDirection == Direction.NORTH)
//                changeCurrentDirectionTo(Direction.WEST);
//            if (currentDirection == Direction.EAST)
//                changeCurrentDirectionTo(Direction.NORTH);
//        }
//    }
//
//    public TurtlePosition getCurrentPosition() {
//        return currentPosition;
//    }
//
//
//    public void moveForward(int numberOfSteps) {
//        if (currentDirection == EAST){
//            currentPosition.setColumnPosition(currentPosition.getColumnPosition()+ numberOfSteps);
//    }
//        if (currentDirection == SOUTH){
//            currentPosition.setRowPosition(currentPosition.getRowPosition()+ numberOfSteps);
//            }
//        if (currentDirection == NORTH){
//            currentPosition.setRowPosition(currentPosition.getRowPosition()+ numberOfSteps);
//        }
//
//        if (currentDirection == WEST){
//            currentPosition.setColumnPosition(currentPosition.getColumnPosition()+ numberOfSteps);
//        }
//
//    }
