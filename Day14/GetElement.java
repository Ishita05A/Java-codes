// It has drawback that we will loose original stack
package Day14;

import java.util.Scanner;
import java.util.Stack;

public class GetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(2);
        st.push(4);
        st.push(3);
        st.push(5);
        System.out.println(st);
        System.out.println("Enter Element no to access ");
        int n = sc.nextInt();
        while (st.size() > n) {
            st.pop();
        }
        System.out.println(st.peek());
        sc.close();

    }

}
