package com.berryjadyn.tacticalsim.model;

public class GridMap {
    private final int rows, cols;

    /**
     * Creates a grid map with the given dimensions
     *
     * @param rows number of rows in the grid
     * @param cols number of columns in the grid
     * @throws IllegalArgumentException if rows or cols are less than or equal to 0
     */
    public GridMap(int rows, int cols) {
        if (rows <= 0 || cols <= 0) throw new IllegalArgumentException("GridMap dimensions must be greater than 0.");

        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    /**
     * Checks if a position is inside the grid.
     * 
     * @param position Current position of the object being checked
     * @return true if the position is inside the grid
     */
    public boolean isInBounds(Position position) {
        return (position.getRow() >= 0 && position.getRow() < rows && position.getColumn() >= 0 && position.getColumn() < cols);
    }

}
