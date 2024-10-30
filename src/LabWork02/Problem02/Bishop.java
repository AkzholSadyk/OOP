package LabWork02.Problem02;

public class Bishop extends Piece {
    private int bcol;
    private char brow;

    public Bishop(char arow, int acol, char brow, int bcol) {
        super(arow, acol);
        this.bcol = bcol;
        this.brow = brow;
    }
    @Override
    public boolean isLegalMove(){
        int diference_char = (int)(brow - arow);
        int diference_san = bcol - acol;
        if(diference_char*diference_char == diference_san*diference_san){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println(false);
            return false;
        }
    }
}
