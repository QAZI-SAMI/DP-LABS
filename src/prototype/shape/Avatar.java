/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.prototype.shape;


public class Avatar extends Shape {
    private String species;

    public Avatar(String species) {
        this.species = species;
        type = "Avatar";
    }

    @Override
    public void draw() {
        System.out.println("Inside Avatar::draw() method for " + species);
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }
}
