package HashMapImplementation;

public class HashMapImplementation<T,T1> {

    int capacity = 16;
    mapEntry mapArray[]  = new mapEntry[capacity];

    public int GetHashCode(T Key)
    {
        return  Key.hashCode();
    }



    public void put(T Key , T1 Value) {

         mapEntry node = new mapEntry(Key , Value );

        System.out.println("hash code:"+ GetHashCode(Key));
        int bucket = GetHashCode(Key)% capacity;
        System.out.println("put the object in bucket: " + bucket);



        if(mapArray[bucket] == null)
        {
            mapArray[bucket] = node;
            //return null;
        }else
        {
            mapEntry existingNodes = mapArray[bucket];

            while(existingNodes.next != null)
            {
                if(existingNodes.getKey().equals(Key) )
                {
                    existingNodes.setValue(Value);
                    break;

                }
                else{
                    existingNodes = existingNodes.next;
                }
            }

            if(existingNodes.getKey().equals(Key) )
            {
               // T1 eValue = (T1) existingNodes.getValue();
                existingNodes.setValue(Value);
                //return eValue;

            }else
            {
                existingNodes.setNext(node);

            }



        }


    }

    public T1 get(T Key)
    {
        int bucket = GetHashCode(Key)%capacity;

        mapEntry enode = mapArray[bucket];
        if(enode == null)
        {
            System.out.println("no element exist with this key : "+ Key);
            return null;
        }else{
            while(enode != null)
            {
                if(enode.getKey().equals(Key))
                {
                    return (T1)enode.getValue();
                }
                enode.getNext();
            }

        }


        return null;
    }


// Traverse a hashmap

    public void Iterate()
    {

        for(int i = 0; i < capacity;i++)
        {
            if(mapArray[i] != null)
            {
                mapEntry entry = mapArray[i];
                do
                {
                   System.out.println(entry.getKey() +" -> "+entry.getValue());
                    entry = entry.getNext();
                }while(entry != null);
            }
        }
    }





}
