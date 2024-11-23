package lab03.Task3;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList=new MyList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        System.out.println("contains apple: "+myList.contains("A"));
        System.out.println("size of list: "+myList.size());
        myList.remove("C");
        System.out.println("remove one element(C), size of list: " +myList.size() );
        myList.clear();
        System.out.println("Is empty status : " + myList.isEmpty());

        System.out.println("------------------------");

        MySet<Integer> mySet=new MySet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);

        System.out.println("contains apple: "+mySet.contains(1));
        System.out.println("size of set: "+mySet.size());
        mySet.remove(2);
        System.out.println("remove one element(2), size of set: " +mySet.size() );
        mySet.clear();
        System.out.println("Is empty status : " + mySet.isEmpty());
    }
}
