package com.pupwalkr.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "walkrs")
public class Walkr {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "walkrid", nullable = false)
   private int walkrId;

   @Column(name = "firstname")
   private String firstName;

   @Column(name="lastname")
   private String lastName;

   @Column
   private long cell;

   @ElementCollection
   @CollectionTable(name="walkrszip", joinColumns = @JoinColumn(name="walkrid"))
   @Column(name="zipcode")
   private Set<Integer> zipCodes;

   public int getWalkrId() {
      return walkrId;
   }

   public void setWalkrId(int walkrId) {
      this.walkrId = walkrId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public long getCell() {
      return cell;
   }

   public void setCell(long cell) {
      this.cell = cell;
   }

   public Set<Integer> getZipCodes() {
      return zipCodes;
   }

   public void setZipCodes(Set<Integer> zipCodes) {
      this.zipCodes = zipCodes;
   }
}
