package LabWork02.Problem02;
import java.util.*;
public class TesterForChess {
    public static void main(String[] args) {
        Vector<Piece> checking = new Vector<>();
        checking.add(new Rook('A', 6, 'A', 5));
        checking.add(new King('B', 6, 'A', 6));
        checking.add(new Knight('C', 6, 'D', 4));
        checking.add(new Bishop('C', 4, 'F', 1));
        checking.add(new Queen('C', 4, 'C', 3));
        for(Piece piece : checking){
            piece.isLegalMove();
        }
    }
}
