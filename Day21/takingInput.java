// Why sc.nextLine(); after nextInt()?
// nextInt() reads only the integer, not the newline character.

// nextLine() reads the rest of the line, including the newline.

// So, to move past the newline after reading the integer, we call sc.nextLine()
package Day21;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(a);
        System.out.println(s);
        sc.close();
    }

}
