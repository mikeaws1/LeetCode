package de.leetcode.romantoint;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "romanintegers")
public class RomanIntsEntity {

   @Id
   private int id;

   @Column
   private String value;

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }
}
