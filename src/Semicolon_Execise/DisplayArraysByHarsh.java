package Semicolon_Execise;

public class DisplayArraysByHarsh {
   private static int[][] array = {{1,1,1,1}, {1,0,0,1},{1,1,1,1},{1,0,0,1}, {1,1,1,1}};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] == 0){
                    System.out.print(" ");
                }

                else{
                    System.out.print("#");
                }

                //System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
