package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {

    Pen pen;
    Turtle ijapa;

    @BeforeEach
    public void startEachTestWithThis(){
        ijapa = new Turtle();
        pen = ijapa.getPen();
    }


    @Test
    public void testThatTurtleHasAPen() {
//        given
        Turtle ijapa = new Turtle();
//        when
        Pen pen = ijapa.getPen();
//        assert
        assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenDown() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        ijapa.penDown();
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenUp() {
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        ijapa.penUp();
        assertSame(PenPosition.UP, ijapa.getPen().getPosition());
    }

    @Test
//   @DisplayName("Turtle Can Turn Right While Facing East")
    public void testThatTurtleCanTurnRightWhileFacingEast() {
        Turtle ijapa = new Turtle();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingSouth(){
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Directions.WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightWhileFacingWest(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Directions.WEST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(Directions.NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnRightWhileFacingNorth(){
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Directions.NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtleCanTurnLeftWhileFacingEast(){
        Turtle ijapa = new Turtle();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Directions.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingWest(){
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Directions.WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingSouth() {
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing north")
    public void testThatTurtleCanTurnLeftFour(){
        // given that
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
        // when
        ijapa.turnLeft();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingEast(){
//        given
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
        //assertSame(new Position(0,0), myTurtle.getCurrentPosition());
//        when
        ijapa.moveForward(5);
//        assert
        assertEquals(new TurtlePosition(0, 5), ijapa.getCurrentPosition());
    }


    @Test
    @DisplayName("Turtle can move on sketch pad test")
    public void turtleCanMoveOnSketchPadTest(){
        ijapa.penDown();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5,5);

        ijapa.writeOn(sketchPad, 3);

        // assert
        int [][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, sketchPad.getFloor()[0][3]);
        assertEquals(new TurtlePosition(0,2), ijapa.getCurrentPosition());

        sketchPad.displayFloor();
    }


    @Test
    @DisplayName("Turtle can move forward while facing south")
    public void testThatTurtleCanMoveForwardWhileFacingSouth(){
        //given

        ijapa.turnRight();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new TurtlePosition(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingWest() {
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Directions.WEST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new TurtlePosition(0, -4), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingNorth(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Directions.NORTH, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new TurtlePosition(-4, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanWriteOnASketchpadWhileFacingEast(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertSame(Directions.EAST, ijapa.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5,5);
        //when
        ijapa.writeOn(sketchPad,3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
//        assertEquals(1, sketchPad.getFloor()[0][3]);
        assertEquals(new TurtlePosition(0, 2), ijapa.getCurrentPosition());
//        sketchPad.displayFloor();
    }

    @Test
    public void testThatTurtleCanWriteOnASketchpadWhileFacingSouth(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        ijapa.writeOn(sketchPad,3);
        ijapa.turnRight();
        assertSame(Directions.SOUTH, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 2), ijapa.getCurrentPosition());
        //when
        ijapa.writeOn(sketchPad, 4);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(1, floor[3][2]);
        assertEquals(0, floor[4][2]);
        assertEquals(new TurtlePosition(3, 2), ijapa.getCurrentPosition());
//        sketchPad.displayFloor();
    }


    @Test
    public void testThatTurtleCanWriteOnASketchpadWhileFacingWest() {
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 4);
        ijapa.turnRight();
        assertSame(Directions.WEST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(3, 2), ijapa.getCurrentPosition());
        //when
        ijapa.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[3][2]);
        assertEquals(1, floor[3][1]);
        assertEquals(1, floor[3][0]);
        assertEquals(new TurtlePosition(3, 0), ijapa.getCurrentPosition());
//        sketchPad.displayFloor();
    }

    @Test
    public void testThatTurtleCanWriteOnASketchpadWhileFacingNorth(){
        //given
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 4);
        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 3);
        ijapa.turnRight();
        assertSame(Directions.NORTH, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(3, 0), ijapa.getCurrentPosition());
        //when
        ijapa.writeOn(sketchPad, 4);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[3][0]);
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[0][0]);
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
        sketchPad.displayFloor();
    }

    @Test
    void testTurtle(){
        SketchPad sketchPad = new SketchPad(5,5);
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 5);
        ijapa.turnRight();
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 5);
        sketchPad.displayFloor();
    }

}





