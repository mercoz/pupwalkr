package com.pupwalkr.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "userid", nullable = false)
   private int userId;

   @Column(name = "email")
   private String email;

   @Column(name = "salt")
   private String salt;

   @Column(name = "passhash")
   private String password;

   @Column(name = "worldpayid")
   private String worldPayId;

   @Column(name = "firstname")
   private String firstName;

   @Column(name="lastname")
   private String lastName;

   @Column
   private long cell;

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getSalt() {
      return salt;
   }

   public void setSalt(String salt) {
      this.salt = salt;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getWorldPayId() {
      return worldPayId;
   }

   public void setWorldPayId(String worldPayId) {
      this.worldPayId = worldPayId;
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
}
