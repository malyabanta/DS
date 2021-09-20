package HashMapImplementation;

public class mapEntry<T, T1> {
    T key ;
    T1 Value;

    mapEntry<T, T1> next ;

    public mapEntry(T Key , T1 Value)
    {
        this.key = Key;
        this.Value = Value;
        this.next = null;
    }



    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T1 getValue() {
        return Value;
    }

    public void setValue(T1 value) {
        Value = value;
    }


    public mapEntry<T,T1> getNext() {
        return next;
    }

    public void setNext(mapEntry<T, T1> next) {
        this.next = next;
    }
}
