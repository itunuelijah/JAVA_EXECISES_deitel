package TurtleGraphics;


import static TurtleGraphics.Directions.*;

public class Turtle {
    private Pen pen = new Pen();
    private Directions currentDirection = Directions.EAST;
    private TurtlePosition currentPosition = new TurtlePosition(0, 0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPosition(PenPosition.DOWN);
    }

    public void penUp() {
        pen.setPosition(PenPosition.UP);
    }

    public Directions getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
//        switch (currentDirection){
//            case SOUTH -> changeCurrentDirectionTo(Direction.WEST);
//        }
      if (currentDirection == NORTH) changeCurrentDirectionTo(Directions.EAST);
      else if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);
      else if (currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
      else if(currentDirection == Directions.EAST) changeCurrentDirectionTo(SOUTH);
    }

    private void changeCurrentDirectionTo(Directions newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == SOUTH) changeCurrentDirectionTo(Directions.EAST);
        else if (currentDirection == WEST) changeCurrentDirectionTo(SOUTH);
        else if (currentDirection == NORTH) changeCurrentDirectionTo(WEST);
        else if (currentDirection == Directions.EAST) changeCurrentDirectionTo(NORTH);
    }

    public TurtlePosition getCurrentPosition() {
        return currentPosition;
    }

//    public void moveForward(int numberOfSteps) {
//        if (currentDirection == Directions.EAST)
//            increaseColumnPositionBy(numberOfSteps);
//    }




    public void moveForward(int numberOfSteps) {
        if (currentDirection == EAST){
            currentPosition.setColumnPosition(currentPosition.getColumnPosition()+ numberOfSteps);
        }
        if (currentDirection == SOUTH){
            currentPosition.setRowPosition(currentPosition.getRowPosition()+ numberOfSteps);
        }
        if (currentDirection == NORTH){
            currentPosition.setRowPosition(currentPosition.getRowPosition()+ numberOfSteps);
        }

        if (currentDirection == WEST){
            currentPosition.setColumnPosition(currentPosition.getColumnPosition()+ numberOfSteps);
        }

    }




    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (this.pen.getPosition() == PenPosition.DOWN) {
            if (this.currentDirection == Directions.EAST) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition+i] = 1;
                }
            }else
            if (this.currentDirection == Directions.SOUTH) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition + i][columnPosition] = 1;
                }
            }else
            if (this.currentDirection == Directions.WEST) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition - i] = 1;
                }
            }else
            if (this.currentDirection == Directions.NORTH){
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++){
                    floor[rowPosition - i][columnPosition] = 1;
                }
            }

        }
        moveForward(numberOfSteps);


    }
//    private void increaseColumnPositionBy(int numberOfSteps){
//        currentPosition.increaseColumnPositionBy(numberOfSteps);
//    }
}



