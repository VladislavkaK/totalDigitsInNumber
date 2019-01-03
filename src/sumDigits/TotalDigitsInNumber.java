package sumDigits;

public class TotalDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       int total = 0;
       total = (number / 100) + ((number / 10) % 10) + (number % 10);
       return total;
    }
}
