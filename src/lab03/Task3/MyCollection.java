package lab03.Task3;

import java.util.*;
public interface MyCollection<T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
    void clear();

}