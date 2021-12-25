package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class ArrayListTest {
    List myArrayList;
    @BeforeEach
    public void startEachTestWith(){
        myArrayList = new ArrayList();
    }

    @Test
    public void arrayListCanBeCreatedTest() {
//    List myArrayList = new anArrayList(); refactor the aList and anArrayList
        assertNotNull(myArrayList);
    }

    @Test
    public void newArrayListIsEmptyTest(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void addElement_ArrayListShouldNotBeEmpty(){
//        when
        myArrayList.add(34);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void addXRemoveX_ArrayListShouldBeEmpty(){
//        when
        myArrayList.add(34);
        myArrayList.remove(34);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void addXAndYRemoveY_ArrayListShouldNotBeEmpty(){
//        when
        myArrayList.add(34);
        myArrayList.add(99);
        myArrayList.remove(99);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void addXAndY_removeY_arrayShouldNotBeEmpty(){
        //when
        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.remove(45);
        //assert
        assertFalse(myArrayList.isEmpty());
    }



    @Test
    public void removeFromEmptyArrayListShouldShowException(){
        assertThrows(IllegalArgumentException.class, ()-> myArrayList.remove(34));
    }

    @Test
    private void addThrows(boolean empty) {
        myArrayList.add(34);
        myArrayList.add(34);
        assertEquals(2, myArrayList.size());

    }
    @Test
    public void addTwoElements_arrayListSizeIncreases(){
        myArrayList.add(34);
        myArrayList.add(45);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void replaceElementInArrayList(){
        myArrayList.add(34);
        myArrayList.add(94, 0);
        assertEquals(94, myArrayList.get(0));
    }

    @Test
    public void addThreeElement_getSecondByIndex(){
        myArrayList.add(34);
        myArrayList.add(32);
        myArrayList.add(99);

        assertEquals(32, myArrayList.get(1));
    }

    @Test
    public void getTheIndexOfElement(){
        myArrayList.add(34);
        myArrayList.add(45);
        myArrayList.add(90);
        assertEquals(0, myArrayList.getIndexOf(32));
    }

    public void arraylistIsElasticTest(){

    }
}


