/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gof.prototype.shape;

import java.util.Objects;


public abstract class Shape implements Cloneable{
    private String id;
   protected String type;
   abstract void draw();
   public String getType(){
      return type;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public Object clone() {
      Object clone = null;  
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return clone;
   }
   public boolean equals(Shape a, Shape b) {
        return Objects.equals(a.getType(), b.getType()) && Objects.equals(a.getId(), b.getId());
   }
}
