package LabWork02.Problem01.PartB;
import java.util.*;
public class TesterForPartB {
    public static void main(String[] args) {
        Vector<LibraryItem> information = new Vector<>();
        information.add( new Book("Abay's way", "Mukhtar Auezov", 1942, 5 ));
        information.add(new DVD_or_Films("Interstellar", "Christopher Nolan", 2014, 8.6));
        for(LibraryItem info : information){
            info.getInformation();
        }
    }
}
