/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.prototype.shape;


public class Fish extends Shape{
    public Fish() {
        type = "Fish";
    }
    @Override
    public void draw() {
        System.out.println("Inside Fish::draw() method.");
    }
}
