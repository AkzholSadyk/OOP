package LabWork02.Problem02;


import practice04.Shape;

import javax.swing.text.Position;

public abstract class Piece {

    protected char arow;
    protected int acol;


    public Piece(char arow, int acol) {
        this.arow = arow;
        this.acol = acol;

    }

    public abstract boolean isLegalMove();
}
