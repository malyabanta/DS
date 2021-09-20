package listPractice;

import java.util.ArrayList;
import java.util.List;

public class listPractice {

    public List show( List lis)
    {
        lis.add("malya");
        return lis;
    }

    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add("test");
        list.add("test1");

        System.out.println(list);
        List value = new listPractice().show(list);

        System.out.println(value);
        System.out.println(list);
    }
}
