package LabWork02.Problem02;

public class Rook extends Piece {

    private char brow;
    private int bcol;
    public Rook(char arow, int acol, char brow, int bcol) {
        super(arow, acol);
        this.bcol = bcol;
        this.brow = brow;
    }
    private boolean ako;
    @Override
    public boolean isLegalMove() {
        if(brow==arow || bcol == acol){
            System.out.println(true);
            return true;
            }
        else{
            System.out.println(false);
            return false;
        }
    }
}
