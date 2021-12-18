package Semicolon_Execise;
//
//import java.util.Scanner;
//
//public class CreditCardNumberValidation {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a credit card number:");
//        long number = input.nextLong();
//        System.out.println();
//    }
//    public static boolean isValid(long number){
//        boolean valid = (getSize(number)) >= 13 && getSize(number) <= 16) &&
//        (prefixMatched(number, 4) || prefixMatched(number, 5)||
//                (prefixMatched(number, 37) || prefixMatched(number, 6))&&
//                        ((sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number))% 10 == 0);
//        return valid;
//    }
//    public static sumOfDoubleEvenPlace(long number){
//        int sum =0;
//        String num = number + "";
//        for (int i = getSize(number) -2; 1>= 0; i -= 2){
//            sum += getDigit(Integer.parseInt(num.charAt(i) + "")*2);
//        }
//        return sum;
//
//    }
//    public static int sumOfOddPlace(long number) {
//        int sum = 0;
//        String num = number + "";
//        for (int i = getSize(number) - 1; 1 >= 0; i -= 2) {
//            sum += Integer.parseInt(num.charAt(i) + "");
//        }
//        return sum;
//    }
//    public static boolean prefixMatched(long number, int d){
//        return getPrefix(number, getSize(d)) == d;
//}
//    public static int getSize (long d){
//    String number = d + "";
//    return num.length();
//    }
//
//    public static long getPrefix(long number, int k){
//        if(getSize(number)> k) {
//            String num = number + "";
//            return Long.parseLong(num.substring(0, k));
//        }
//        return number;
//
//        }
//    }
