import java.util.Scanner;

public class Queue {
    static int size = 5;
    static int queue[] = new int[size];
    static int f = -1;
    static int r = -1;

    public static void push(int val) {
        if (r==size-1) {
            System.out.println("OverFlow..");
        } else if (f == -1 && r == -1) {
            f = f + 1;
            r = r + 1;
            queue[r] = val;
        } else {
            r = r + 1;
            queue[r] = val;
        }
    }

    public static void pop() {
        if (r == -1 && f == -1) {
            System.out.println("UnderFlow..");
        }  else {
            f = f + 1;
        }
    }

    public static void display() {
        for (int i = f; i <=r; i++) {
            System.out.print(queue[i] + " ");
        }
    }

    public static void main(String[] args) {
        boolean c = true;
        Scanner sc = new Scanner(System.in);

        while (c) {
            System.out.println("------Menu------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.exit");
            System.out.println("----------------");
            System.out.print("Enter your choice: ");
            int m = sc.nextInt();

            switch (m) {
                case 1:
                    System.out.print("Enter the Value : ");
                    int val = sc.nextInt();
                    push(val);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    c = false;
                    break;
                default:
                    break;
            }
        }
    }
}