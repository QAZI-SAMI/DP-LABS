package GOF.Flyweight.RenderingForest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits, Color fruitColor) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData, isFruitTree, countOfFruits, fruitColor);
            treeTypes.put(name, result);
        }
        return result;
    }
}
