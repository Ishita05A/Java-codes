//First Multiple of 5 and 7
package Day09;

public class revQuest1 {
    public static void main(String[] args) {
        int n = 1;
        while (n % 5 != 0 || n % 7 != 0) {
            n++;
        }
        System.out.println(n);
    }

}
