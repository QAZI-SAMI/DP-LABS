/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.prototype.shape;


public class Main {
    public static void main(String[] args) {
      ShapeCache.loadCache();

//      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      Shape clonedShape = ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());		

//      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      Shape clonedShape2 = ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		

//      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      Shape clonedShape3 = ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());	
      Shape clonedFish = new Avatar("Fish");
      Shape clonedHuman = new Avatar("Human");   
      System.out.println("Shapes are equal: " + ShapeCache.compareShapes(clonedShape, clonedShape2));
      System.out.println("Avatars are equal: " + ShapeCache.compareShapes(clonedFish, clonedHuman));
   }
}
