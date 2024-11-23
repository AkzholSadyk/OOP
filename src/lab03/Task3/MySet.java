package lab03.Task3;


import java.util.HashSet;
import java.util.Set;

public class MySet<T> implements MyCollection<T> {
    private HashSet<T> set;
    public MySet(){
        set = new HashSet();
    }

    @Override
    public void add(T element) {
        set.add(element);
    }

    @Override
    public void remove(T element) {
        set.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return set.contains(element);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return (set.size()==0);
    }

    @Override
    public void clear() {
        set.clear();
    }
}
