
import java.util.*;


public class Functions {
    public static void printMyName(String name) {
        System.out.print(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();

        printMyName(name);
}

}

public class Functions {
    public static int CalculateSum(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a, b);
        System.out.println(sum);
    }
}

public class Functions {
    public static int factorial(int a) {
        if (a == 1) {
            return 1;
        }

        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}