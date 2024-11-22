package lab03.Task5;

public class Sort {
    static <E> void swap(E[] array , int i , int j) {
        E main = array[i];
        array[i] = array[j] ;
        array[j] = main  ;
    }
    static <E extends Comparable<E>> void  bubbleSort(E [] array) {
        int size = array.length ;
        boolean checkSwap ;

        for(int i = 0 ; i < size -1 ; i ++) {
            checkSwap = false ;
            for(int j = 0 ; j < size - 1 - i ; j++) {
                if(array[j].compareTo(array[j+1]) == 1) {
                    swap(array , j , j+1) ;
                    checkSwap = true;
                }
            }
            if(!checkSwap) {
                break ;
            }
        }
    }
}