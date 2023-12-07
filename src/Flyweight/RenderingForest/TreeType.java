package GOF.Flyweight.RenderingForest;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;
    private Color fruitColor;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits, Color fruitColor) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
        this.fruitColor = fruitColor;
    }

    public void draw(Graphics g, int x, int y) {
        int treeSize = determineTreeSize(y);

        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);

        g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);

        if (isFruitTree) {
            g.setColor(fruitColor);
            g.fillOval(x - treeSize / 2, y - treeSize, treeSize, treeSize);

            g.setColor(Color.RED);
            for (int i = 0; i < countOfFruits; i++) {
                g.fillOval(x - 3 + i * 3, y - treeSize - 5, 3, 3);
            }
        }
    }

    private int determineTreeSize(int y) {
        if (y < 200) { // North (small)
            return 20;
        } else if (y < 400) { // Middle (medium)
            return 40;
        } else { // South (large)
            return 60;
        }
    }
}
