package locters;

public class s {

    public static void main(String[] args) {

        int number = 38154;
        int result = number;

        while (result > 9) {
            result = sumDigits(result);
        }

        System.out.println("Final single digit sum: " + result);
    }

    public static int sumDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
