package GOF.Flyweight.RenderingForest;

import java.awt.*;

public class Main {
    static int CANVAS_SIZE = 800;
    static int TREES_TO_DRAW = 100;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(
                random(0, CANVAS_SIZE),
                random(0, CANVAS_SIZE),
                "Summer Oak",
                Color.GREEN,
                "Oak texture stub",
                true,
                5,
                Color.ORANGE
            );
            forest.plantTree(
                random(0, CANVAS_SIZE),
                random(0, CANVAS_SIZE),
                "Autumn Oak",
                Color.ORANGE,
                "Autumn Oak texture stub",
                true,
                3,
                Color.RED
            );
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
