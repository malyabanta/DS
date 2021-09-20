package HashMapImplementation;

public class driver {


    public static void main(String args[])
    {
        HashMapImplementation<Integer , String> myhashMap = new HashMapImplementation<Integer , String>();
        myhashMap.put(1, "com");
        myhashMap.put(2,"optum");
        myhashMap.put(30,"optum");
        myhashMap.put(31,"My Office");

        myhashMap.put(2,"UHG");

        String value = myhashMap.get(2);
        System.out.println(value);

        HashMapImplementation<String , String> myhashMap1 = new HashMapImplementation<String , String>();
        myhashMap1.put("malya", "com");
        myhashMap1.put("deep","optum");
        myhashMap1.put("Off","optum");
        myhashMap1.put("work","My Office");

        myhashMap1.put("Home","UHG");

        String value1 = myhashMap1.get("work");
        System.out.println(value1);


        myhashMap1.Iterate();



    }


}
