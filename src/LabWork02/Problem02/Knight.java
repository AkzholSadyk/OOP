package LabWork02.Problem02;

public class Knight extends Piece{
    private int bcol;
    private char brow;

    public Knight(char arow, int acol, char brow, int bcol) {
        super(arow, acol);
        this.bcol = bcol;
        this.brow = brow;
    }

    @Override
    public boolean isLegalMove() {
        boolean ako ;
        int kishi_san = acol - 2;
        int ulken_san = acol + 2;
        int orta_san_1 = acol + 1;
        int orta_san_2 = acol - 1;
        char kishi_char = (char) (arow - 2);
        char ulken_char = (char) (arow + 2);
        char orta_char_1 = (char) (arow - 1);
        char orta_char_2 = (char) (arow + 1);
        if(kishi_char == brow && (bcol== orta_san_1 || bcol== orta_san_2) || ulken_char == brow &&(bcol == orta_san_1||bcol== orta_san_2)){
            System.out.println(true);
            return true;
        }

        else if(orta_char_1 == brow && (bcol == ulken_san || bcol == kishi_san) || orta_char_2 == brow && (bcol == ulken_san || bcol == kishi_san) ){
            System.out.println(true);
            return true;

        }
        else{
            System.out.println(false);
            return false;
        }


    }


}
