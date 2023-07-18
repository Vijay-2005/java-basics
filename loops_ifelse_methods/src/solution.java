public class solution {
    public static String numberToWords(int number) {
        number = reverse(number);
        StringBuilder result = new StringBuilder();
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0 -> result.append("Zero ");
                case 1 -> result.append("One ");
                case 2 -> result.append("Two ");
                case 3 -> result.append("Three ");
                case 4 -> result.append("Four ");
                case 5 -> result.append("Five ");
                case 6 -> result.append("Six ");
                case 7 -> result.append("Seven ");
                case 8 -> result.append("Eight ");
                case 9 -> result.append("Nine ");
            }
            number = number / 10;
        }

        return result.toString();
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String ans = numberToWords(234);
        System.out.println(ans);
    }
}
