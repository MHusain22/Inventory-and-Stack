import java.util.Scanner;

public class Stack{
    static int top=-1;
    static int siz=5;
    static  int[] stack = new int[siz];
    // public Stack(){
    //     top=-1;
    //     siz=0;
    // }

    public static void push(int val){
        if(top>=siz){
            System.out.println("Stack Overflow..");
            return;
        }
        else{
            top =top+1;
            stack[top]=val;
            
        }
    }
    public static void pop(int[] stack){
        if (top==-1) {
            System.out.println("Stack Underflow..");
        }
        else{
            siz--;
            top = top-1;
        }
    }
    public static void display(int[] stack){
        for (int i = 0; i <=top; i++) {
            System.out.print(stack[i]+" ");
        }
    }
    public static boolean isFull(){
        return top==siz-1;
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
                    pop(stack);
                    break;
                case 3:
                    display(stack);
                case 6:
                    c=false;
                default:
                    break;
            }
        }
    }
}