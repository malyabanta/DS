package stackImplementation;

public class StackImplementation {

    int top = -1 ;
    int max_size= 1000;
    int arr[] = new int[max_size];

    public void push(int Element)
    {
        if(top >= max_size)
        {
            System.out.println("stack overflow");

        }else{

            arr[++top] = Element;
        }
    }

    public int pop()
    {
        int element;
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return 0;
        }else{
            element = arr[top];
            top --;
        }

        return element;

    }

    public void traverse()
    {

        while (top != -1)
        {
            System.out.println(arr[top]);
            top --;
        }
    }

}
