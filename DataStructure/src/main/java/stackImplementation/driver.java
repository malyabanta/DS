package stackImplementation;

public class driver {

    public static void main (String args[]) {

        StackImplementation stack = new StackImplementation();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack .push(50);

        // pop opetation

        int element = stack.pop();
        System.out.println("element poped:"+element);

        stack.traverse();

    }

}
