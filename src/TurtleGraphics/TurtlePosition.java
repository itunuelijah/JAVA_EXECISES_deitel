package TurtleGraphics;

public class TurtlePosition {
    private int rowPosition;
    private int columnPosition;

    public TurtlePosition(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Position position = (Position) o;
//        return rowPosition == position.rowPosition && columnPosition == position.columnPosition;
//    }
    @Override
    public String toString() {
        return "TurtlePosition {" +
                "rowPosition = " + rowPosition  +
                ", columnPosition = " + columnPosition +
                 '}';
    }



//    @Override
//    public boolean equals(Object o){
//
//        if (this == o){
//            return true;
//        }
//        if (!(o instanceof TurtlePosition positionToBeCompared)){
//            return false;
//        }
//        boolean rowsAreEqual = rowPosition == positionToBeCompared.rowPosition;
//        boolean columnsAreEqual = columnPosition == positionToBeCompared.columnPosition;
//        return rowsAreEqual && columnsAreEqual;
//    }
//               or


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TurtlePosition comparedTurtlePosition)) return false;
        boolean rowsAreEqual = Integer.compare(this.rowPosition, comparedTurtlePosition.rowPosition) == 0;
        boolean columnsAreEqual = Integer.compare(this.columnPosition, comparedTurtlePosition.columnPosition) == 0;
        return rowsAreEqual && columnsAreEqual;
    }



    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }
}



