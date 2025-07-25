class ReverseInteger {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         // get the last digit
            reversed = reversed * 10 + digit; // add it to reversed
            num = num / 10;               // remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}
