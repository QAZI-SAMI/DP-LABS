package GOF.Flyweight.RenderingForest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits, Color fruitColor) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData, isFruitTree, countOfFruits, fruitColor);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
