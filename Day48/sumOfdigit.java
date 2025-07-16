package Day48;

public class sumOfdigit {
    static int sumOfDigit(int num) {
        if (num >= 0 && num < 10)
            return num;
        return (num % 10 + sumOfDigit(num / 10));
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(3456));
    }

}
