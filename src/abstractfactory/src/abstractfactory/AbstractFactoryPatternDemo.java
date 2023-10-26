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
public class AbstractFactoryPatternDemo {
     public static void main(String[] args) {
      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false,false);
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      Shape shape3 = shapeFactory.getShape("Triangle");
      //call draw method of Shape Triangle
      shape3.draw();
      //get shape factory
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true,true);
      //get an object of Shape Rectangle
      Shape shape4 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape4.draw();
      //get an object of Shape Square 
      Shape shape5 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape5.draw();
      Shape shape6 = shapeFactory1.getShape("TRIANGLE");
      //call draw method of Shape Square
      shape6.draw();
      
   }
}