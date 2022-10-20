package de.leetcode.romantoint;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "romanintegers")
@Getter
@Setter
public class RomanIntsEntity {

   @Id
   private int id;

   @Column
   private String value;

}
