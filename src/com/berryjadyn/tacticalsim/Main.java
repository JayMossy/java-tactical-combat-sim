package com.berryjadyn.tacticalsim;

import com.berryjadyn.tacticalsim.model.Position;
import com.berryjadyn.tacticalsim.view.ConsoleRenderer;

public class Main {
    public static void main(String[] args) {
        Position position = new Position(2, 3);
        ConsoleRenderer cr = new ConsoleRenderer();
        cr.render(5, 5, position);

    }
}