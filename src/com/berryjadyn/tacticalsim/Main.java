package com.berryjadyn.tacticalsim;

import com.berryjadyn.tacticalsim.model.GridMap;
import com.berryjadyn.tacticalsim.model.Position;
import com.berryjadyn.tacticalsim.view.ConsoleRenderer;

public class Main {
    public static void main(String[] args) {

        GridMap gridMap = new GridMap(5, 5);

        System.out.println("Bounds Tests:");
        Position position0 = new Position(0, 0); // (0, 0) True
        Position position1 = new Position(4, 4);     // (4, 4) True
        Position position2 = new Position(-1, 0);    // (-1, 0) False
        Position position3 = new Position(0, 5);     // (0, 5) False
 
        System.out.println("Expected: Position: (0, 0), In Bounds: true");
        System.out.println("Result: Position: " + position0 + ", In Bounds: " + gridMap.isInBounds(position0) + "\n");
        
        System.out.println("Expected: Position: (4, 4), In Bounds: true");
        System.out.println("Result: Position: " + position1 + ", In Bounds: " + gridMap.isInBounds(position1) + "\n");

        System.out.println("Expected: Position: (-1, 0), In Bounds: false");
        System.out.println("Result: Position: " + position2 + ", In Bounds: " + gridMap.isInBounds(position2) + "\n");
        
        System.out.println("Expected: Position: (0, 5), In Bounds: false");
        System.out.println("Result: Position: " + position3 + ", In Bounds: " + gridMap.isInBounds(position3) + "\n");
        

        System.out.println("Render Test:");
        ConsoleRenderer renderer = new ConsoleRenderer();
        Position testRenderPosition = new Position(2, 2);
        renderer.render(gridMap, testRenderPosition);


        // Tests that should crash:
        // System.out.println("Invalid Map Test:");
        // GridMap gridMap1 = new GridMap(-1, 4);
        // System.out.println(gridMap1);

    }
}