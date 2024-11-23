package lab03.Task3;

import java.util.*;


public class MyList<T> implements MyCollection<T> {
    private ArrayList<T> list;

    public MyList(){
        list = new ArrayList<>();
    }

    @Override
    public void add(T element) {
        list.add(element);
    }

    @Override
    public void remove(T element) {
        list.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return list.contains(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return (list.size()==0)? true:false;
    }

    @Override
    public void clear() {
        list.clear();
    }

}
