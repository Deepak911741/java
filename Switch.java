import java.util.*;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
            case 2:
                System.out.println("Hello");
            case 3:
                System.out.println("Hello");
            case 4:
                System.out.println("Hello");
            default:
                System.out.println("Invalid Button");
        }
    }
}
