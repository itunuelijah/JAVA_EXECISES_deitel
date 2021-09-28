package chapter5;

public class Kata {
    private int price = 1500;
    private int totalPrice;

    public int getPrice(int copiesOfPastQuestions) {
        boolean copiesOfPassQuestionLessThan4 = copiesOfPastQuestions >= 1 && copiesOfPastQuestions <= 4;
        if (copiesOfPassQuestionLessThan4) {
            price = 1500;
        }

        boolean copiesOfPassQuestionLessThan10 = copiesOfPastQuestions >= 5 && copiesOfPastQuestions <= 9;
        if (copiesOfPassQuestionLessThan10) {
            price = 1400;
        }

        boolean copiesOfPassQuestionLessThan30 = copiesOfPastQuestions >= 10 && copiesOfPastQuestions <= 29;
        if (copiesOfPassQuestionLessThan30) {
            price = 1200;
        }

        boolean copiesOfPassQuestionLessThan40 = copiesOfPastQuestions >= 30 && copiesOfPastQuestions <= 49;
        if (copiesOfPassQuestionLessThan40) {
            price = 1100;
        }

        boolean copiesOfPassQuestionLessThan50 = copiesOfPastQuestions >= 50 && copiesOfPastQuestions <= 99;
        if (copiesOfPassQuestionLessThan50) {
            price = 1000;
        }
        boolean copiesOfPassQuestionLessThan200 = copiesOfPastQuestions >= 100 && copiesOfPastQuestions <= 199;
        if (copiesOfPassQuestionLessThan200) {
            price = 900;
        }

        boolean copiesOfPassQuestionGreaterThan200 = copiesOfPastQuestions >= 200;
        if (copiesOfPassQuestionGreaterThan200) {
            price = 800;
        }

        totalPrice = copiesOfPastQuestions * price;

        return price;

    }
    public static void main (String[] args) {

//        System.out.println( Kata.totalPrice);

    }
}
