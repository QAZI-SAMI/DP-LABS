/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fa20-bse-024
 */
public class DoubleBorderFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("DOUBLERECTANGLE")) {
            return new DoubleBorderRectangle();
        } else if (shapeType.equalsIgnoreCase("DOUBLETRIANGLE")) {
            return new DoubleBorderTriangle();
        }
        return null;
    }
}