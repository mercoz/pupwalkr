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

   public Set<Integer> getZipCodes() {
      return zipCodes;
   }

   public void setZipCodes(Set<Integer> zipCodes) {
      this.zipCodes = zipCodes;
   }
}
