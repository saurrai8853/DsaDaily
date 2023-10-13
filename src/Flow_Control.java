import java.util.Scanner;
import java.util.*;
public class Flow_Control {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Press 1 for check leap year or not");
            System.out.println("Press 2 for check sum of two Number");
            System.out.println("Press 3 for print the Table");
            System.out.println("Press 4 for HCF and LCF");
            System.out.println("Press 5 for Guess the number Game");
            System.out.println("Press 6 to exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter year for check leap year or not ");
                    int year = sc.nextInt();
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }

                    break;
                case 2:
                    int sum = 0, rem = 0;
                    System.out.println("Enter the number");
                    int num = sc.nextInt();
                    while (num > 0) {
                        rem = num % 10;
                        sum = sum + rem;
                        num = num / 10;
                    }
                    System.out.println("sum of the number is :" + sum);

                    break;
                case 3:
                    System.out.println("Enter the number for table");
                    int table = sc.nextInt();
                    for (int i = 0; i <= 10; i++) {
                        int res = i * table;
                        System.out.println(i + "*" + table + "=" + res);
                    }
                    break;
                case 4:
                    System.out.println("Enter both number:");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int temp1 = num1;
                    int temp2 = num2;
                    while (temp2 != 0) {
                        int temp = temp2;
                        temp2 = temp1 % temp2;
                        temp1 = temp;

                    }
                    int HCF = temp1;
                    System.out.println("HCF of both number is:" + HCF);
                    int LCF = (num1 * num2) / HCF;
                    System.out.println("LCF of both number is:" + LCF);
                    break;
                case 5:
                    int key = 72;
                    System.out.println("Enter number b/w 1 to 100");
                    int element = sc.nextInt();
                    while (element > 1 && element <= 100) {
                        if (element == key) {
                            System.out.println("Hurry.. you gessed Right");
                            break;
                        } else if (element > key) {
                            System.out.println("you guess grater then value,try again");
                            break;
                        } else {
                            System.out.println("You guess less then value,try again");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close(); // Close the scanner before exiting
                    System.exit(0); // Exit the program
                    break;

                default:
                    System.out.println("Invalid input!.. try again");


            }

        }
    }
}