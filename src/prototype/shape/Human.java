/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.prototype.shape;


public class Human extends Shape {
    public Human() {
        type = "Human";
    }

    @Override
    public void draw() {
        System.out.println("Inside Human::draw() method.");
    }
}
