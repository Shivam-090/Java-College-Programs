import java.util.*;

public class Quest2 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter number of month");
        do {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("Enter 0 for exit");
            if (a >= 1 && a <= 12 || a == 0) {
                switch (a) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("Feburary");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("Sept");
                        break;
                    case 10:
                        System.out.println("Oct");
                        break;
                    case 11:
                        System.out.println("Nov");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                }
            } else {
                System.out.println("Error! Input between 1 & 12");
            }
        } while (a != 0);
    }
}