package TurtleGraphics;
//
//public class PenPosition {
//    UP,DOWN;
//
//}
//--------
//        package TurtleGraphics;
//
//public enum PenPosition {
//    UP,
//    DOWN;
//}
//--------
//
//        package TurtleGraphics;
//
//        import java.util.Objects;
//
//public class TurtlePosition {
//
//    private int rowPosition;
//    private int columnPosition;
//
//    public TurtlePosition(int rowPosition, int columnPosition) {
//        this.rowPosition = rowPosition;
//        this.columnPosition = columnPosition;
//
//    }
//
//    @Override
//    public String toString() {
//        return "TurtlePosition{" +
//                "rowPosition=" + rowPosition +
//                ", columnPosition=" + columnPosition +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof TurtlePosition comparedTurtlePosition)) return false;
//        boolean rowsAreEqual = Integer.compare(this.rowPosition, comparedTurtlePosition.rowPosition) == 0;
//        boolean columnsAreEqual = Integer.compare(this.columnPosition, comparedTurtlePosition.columnPosition) == 0;
//        return rowsAreEqual & columnsAreEqual;
//    }
//
////    @Override
////    public int hashCode() {
////        return Objects.hash(rowPosition, columnPosition);
////    }
//
//    public void increaseColumnPositionBy(int numberOfSteps) {
//        columnPosition+=numberOfSteps;
//    }
//}
//;