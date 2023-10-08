package edu.hw1;

public class Task5 {
    private Task5() {
    }

    private static boolean isPalindrome(String number) {
        String reversedNumber = new StringBuilder().append(number).reverse().toString();
        return number.equals(reversedNumber);
    }

    public static boolean isPalindromeDescendant(int number) {
        String num = Integer.toString(number);
        while (num.length() > 1 && num.length() % 2 == 0 && !isPalindrome(num)) {
            StringBuilder compressedNumber = new StringBuilder();
            for (int i = 0; i < num.length(); i += 2) {
                compressedNumber.append((char)(num.charAt(i) - '0' + num.charAt(i + 1)));
            }
            num = compressedNumber.toString();
        }

        return isPalindrome(num);
    }
}
