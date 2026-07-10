import java.util.*;

public class strings {
    public static void main(String[] args) {

        // Concatenation
        Scanner sc = new Scanner(System.in);

        String firstname = "Shivam";
        String lastname = "Chaudhary";

        String fullname = firstname + " " + lastname;

        System.out.println("Full Name: " + fullname);

        // Length
        System.out.println("Length: " + fullname.length());

        // Print all characters
        System.out.println("Characters:");
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        // Compare Strings
        String one = "Shivam";
        String two = "Shivam";

        if (one.compareTo(two) == 0) {
            System.out.println("Both are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        sc.close();
    }
}