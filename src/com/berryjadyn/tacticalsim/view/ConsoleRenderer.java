package com.berryjadyn.tacticalsim.view;

import com.berryjadyn.tacticalsim.model.Position;

public class ConsoleRenderer {

    public void render(int rows, int cols, Position position) {
        for (int i = 0; i < rows; i++) {
            if (i == position.getRow()) {
                for (int j = 0; j < cols; j++) {
                    if (j == position.getColumn()) {
                        System.out.print("P ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < cols; j++) {
                    System.out.print(". ");
                }
                System.out.println();
            }
        }
    }

    // public void render(int rows, int cols, Position position) {
    //     for (int i = 0; i < rows; i++) {
    //         for (int j = 0; j < cols; j++) {
    //             if (BinarySearch(rows, position.getRow())) {
    //                 if (BinarySearch(cols, position.getColumn())) {
    //                     System.out.print("P ");
    //                 }
    //                 System.out.print(". ");
    //             } else {
    //                 System.out.print(". ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // }

    // private boolean BinarySearch(int section, int target) {
    //     return BinarySearch(section, 0, section, target);
    // }

    // private boolean BinarySearch(int section, int min, int max, int target) {
    //     int midPoint;
    //     midPoint = (max + min) / 2;

    //     if (target == midPoint) {
    //         return true;
    //     } else if (target < midPoint) {
    //         return BinarySearch(section, min, midPoint - 1, target);
    //     } else if (target > midPoint) {
    //         return BinarySearch(section, midPoint + 1, max, target);
    //     }

    //     return false;

    // }
}