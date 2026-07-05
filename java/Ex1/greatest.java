import java.util.*;

public class greatest {
    public static int Greatest(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            System.out.println("Both are Equal");
        }
        return 0;
    }

    public static void main(String args[]) {
        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int result=Greatest(a, b);
        System.out.println(result);
    }
}
