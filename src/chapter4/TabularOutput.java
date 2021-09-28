package chapter4;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N\t\t10*N  100*N  1000*N");

        for (int roll = 1; roll <= 5; roll++)

            for (int roll2 = 10; roll2 <= 50; roll2 += 10)

                for (int roll3 = 100; roll3 <= 500; roll3 += 100)
                    for (int roll4 = 1000; roll4 <= 50; roll4 += 1000)
                        System.out.println(roll + "\t\t" + roll2 +  "  " + roll3 + "  " + roll4);

    }
}
