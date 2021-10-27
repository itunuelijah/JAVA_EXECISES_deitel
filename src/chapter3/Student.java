package chapter3;

public class Student {
    private String name;
    private int marks;

    public Student (String name){
        this.name = name;
    }
    public void setMarks(int studentMark){
        marks = studentMark;
    }
    public void printStudentNameAndMark(){
        System.out.print("Name: " + name + ", ");
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Rose");
        Student studentTwo = new Student("Ade");
        Student studentThree = new Student("Deji");

        studentOne.setMarks(70);
        studentTwo.setMarks(80);
        studentThree.setMarks(90);

        studentOne.printStudentNameAndMark();
        studentTwo.printStudentNameAndMark();
        studentThree.printStudentNameAndMark();


    }
}
