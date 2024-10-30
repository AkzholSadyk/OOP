package LabWork02.Problem02;

public class King extends Piece {
    private int bcol;
    private char brow;

    public King(char arow, int acol, char brow, int bcol) {
        super(arow, acol);
        this.bcol = bcol;
        this.brow = brow;
    }

    @Override
    public boolean isLegalMove() {
        int kishi_san = acol - 1;
        int ulken_san = acol + 1;
        char kishi_char = (char) (arow - 1);
        char ulken_char = (char) (arow + 1);
        boolean ako;
        if (bcol>=kishi_san && bcol<=ulken_san && brow>=kishi_char && brow<=ulken_char) {
              System.out.println(true);
              return true;
//            if (bcol == kishi_san || bcol == ulken_san || brow == kishi_char || brow == ulken_char) {
//                System.out.println(true);
//                return true;
//            }
//            else{
//                System.out.println(false);
//                return false;
//            }

        } else {
            System.out.println(false);
            return false;
        }
    }
}

