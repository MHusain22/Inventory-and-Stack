#include<stdio.h>

int stack[10],minstack[10];

int size = sizeof(stack)/sizeof(int);
int top=-1;
void push(int val){
    if(top == size-1){
        printf("stack is Overflow!!!!\n");
    }
    else if(top==-1){
          top=top+1;
        stack[top]= val;
         minstack[top]=val;
    }
    else{
        top=top+1;
        stack[top]= val;
        if(stack[top]<=minstack[top-1]){
            minstack[top]=val;
        }
        else{
            minstack[top]=minstack[top-1];
        }
        
    }
   
}
void pop(){
    if(top==-1){
        printf("Stack is underflow!!!!\n");

    }
    else{
        top= top-1;
    }

}

int peek(){
  return stack[top];
}
int min(){
    return minstack[top];
}
void display(){
    int i;
    printf("[");
    for(i=0;i<=top;i++){
        printf("%d ",stack[i]);
    }
    printf("]");
}
int main(){
    int n,val;
    while(1){
    printf("\n--------------------------Menu----------------------");
    printf("\n1.Push\n2.Pop\n3.Peek\n4.Min\n5.Display \n6.exit\n");
    scanf("%d",&n);
    switch(n){
        case 1: printf("Enter value To push:");
                scanf("%d",&val);
                push(val);
        break;
        case 2: 
                pop();
        break;
        case 3:
                printf("%d",peek());
        break;
        case 4:
                printf(" Min value in Stack:%d",min());
        break;
        case 5:
                display();
        break;
        case 6: return 0;
        break;
        default:printf("Invalid input");
        break;
    }

    }
    }