package com.optum.LinkList.SingleLinkList.HashMap;

public class ImplementHashMap<T,T1> {

    int HashMapsize = 16;
    MapEntry<T,T1>[]  hashMapEntry = new MapEntry[HashMapsize];


    public int getHashCode(T key)
    {
        return key.hashCode();
    }

    public T1 put(T key, T1 value)
    {
       MapEntry m = new MapEntry(key,value);
        int bucket;
        T1 OldValue = null;

       if(key == null)
       {
           bucket = 0;
       }else {
           bucket = getHashCode(key) % HashMapsize;
       }
        System.out.println("bucket"+bucket);

       if(hashMapEntry[bucket] == null)
       {
           hashMapEntry[bucket] = m;
       }else {
           MapEntry existingNOde = hashMapEntry[bucket];
           while (existingNOde.getNext() != null)
           {
               if (existingNOde.getKey() == key) {
                   OldValue = (T1) existingNOde.getValue();
                   existingNOde.setValue(value);

               } else {
                   existingNOde = existingNOde.getNext();
               }
           }
           if(existingNOde.getKey() == key)
           {
               OldValue = (T1)existingNOde.getKey();
               existingNOde.setValue(value);
           }else{
               existingNOde.setNext(m);
           }

       }
        return OldValue;
    }


    public T1 Get(T key)
    {
        int bucket = getHashCode(key)% HashMapsize;
        T1 tempValue = null;

        if(hashMapEntry[bucket] == null)
        {
            System.out.println("no such key exist");
            tempValue = null;
        }else{
            MapEntry m = hashMapEntry[bucket];
            while(m != null)
            {
                if(m.getKey() == key)
                {
                    tempValue =(T1) m.getValue();
                    break;
                }
                m = m.getNext();
            }


        }
        return tempValue;
    }

    //  Traverse a Hash Map

 public void Iterator()
 {
     for(int i = 0 ; i < HashMapsize-1;i++)
     {
         if(hashMapEntry[i] != null)
         {
             MapEntry m = hashMapEntry[i];
             while(m != null)
             {
                 System.out.println(m.getKey().toString()+"->"+ m.getValue().toString());
                 m= m.getNext();
             }

         }
     }
 }




}
