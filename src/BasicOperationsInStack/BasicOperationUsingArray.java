package BasicOperationsInStack;

import java.util.Scanner;

class Stack
{
    int[] ar;
    int top;
    Stack(int size)
    {
        top=-1;
        ar=new int[size];
    }
    public void push(int data)
    {
        if(top==ar.length-1)
        {
            System.out.println("Stack Overflow");
            return;
        }
        ar[++top]=data;
    }
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        return ar[top--];
    }
    public void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <=top ; i++)
        {
            System.out.println(ar[i]);
        }
    }
    public int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return ar[top];
    }

}

public class BasicOperationUsingArray
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        Stack s=new Stack(sc.nextInt());
        while(true)
        {
            System.out.println("1.Push Operation \n2.Pop Operation \n3.Traverse \n4.Peek Value \n5.Exit");
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the data to push");
                    s.push(sc.nextInt());
                    break;
                }
                case 2:
                {
                    System.out.println("Poping the Value");
                    int x=s.pop();
                    if(x!=-1)
                    {
                        System.out.println("Popped Element:"+x);
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Printing the stack..");
                    s.traverse();
                    break;
                }
                case 4:
                {
                    int x=s.peek();
                    if(x!=-1) {
                        System.out.println(x);
                    }
                    break;
                }
                case 5:
                {
                    System.exit(0);
                }
            }
        }
    }
}
