package com.berryjadyn.tacticalsim.model;


/* 
 * Stores position of an entity at a point
 * Position is top-bottom (row) and left-right (column) 
*/
public class Position {
    private final int DEFAULT = 0;
    private int row, column;


    /**
     * Returns the current row and column of an entity
     * If no position is stated, entity starts at top left
     * 
     * @param row (top-bottom)
     * @param column (left-right)
     * @return Position (row, column)
     */
    public Position() {
        this.row = DEFAULT;
        this.column = DEFAULT;

    }
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String toString() {
        return "(" + row + ", " + column + ")";
    }

}
