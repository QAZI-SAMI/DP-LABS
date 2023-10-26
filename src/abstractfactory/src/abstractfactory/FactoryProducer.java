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
public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }

    public static AbstractFactory getDoubleBorderFactory(boolean doubleBorder) {
        if (doubleBorder) {
            return new DoubleBorderFactory();
        }
        //any other factory in future can be added here
        return null;
    }
}