import java.util.Scanner;

public class Stack {

    static int top = -1;
    static int siz = 5;
    static int[] stack = new int[siz];
    static int[] minstack = new int[siz];

    public static void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow..");
            return;
        } else if (top == -1) {
            top = top + 1;
            stack[top] = val;
            minstack[top] = val;
        } else {
            top = top + 1;
            stack[top] = val;
            if(stack[top]<=minstack[top-1]){
                minstack[top]=val;
            }
            else{
                minstack[top]=minstack[top-1];
            }
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow..");
        } else {
            top = top - 1;
        }
    }

    public static void display(int[] stack) {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    public static int min(){
        return minstack[top];
    }

    public static boolean isFull() {
        return top == siz - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of Stack : ");
        // int n = sc.nextInt();

        boolean c = true;
        while (c) {
            System.out.println("------Menu------");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.display");
            System.out.println("4.min");
            System.out.println("5.peek");
            System.out.println("6.exit");
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
                    display(stack);
                case 4:
                    min();
                case 6:
                    c = false;
                default:
                    break;
            }
        }
    }
}