// package com.match.model;

// import com.google.gson.annotations.Expose;

// import java.util.*;

// import javax.persistence.CascadeType;
// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
// import javax.persistence.Lob;
// import javax.persistence.ManyToMany;
// import javax.persistence.OneToMany;
// import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIdentityInfo;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// @Entity
// @Table(name = "User")
// @JsonIdentityInfo(
//         generator = ObjectIdGenerators.PropertyGenerator.class,
//         property = "uid")
// public class User {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Expose
//   private BigInteger uid;

//   @Expose
//   @Lob
//   private String username;
//   @Lob
//   private String password;
//   @Lob
//   private String firstName;
//   @Lob
//   private String lastName;
//   @Lob
//   private String email;

//   private int age;

//   public User() {}

//   public BigInteger getUid() {
//     return uid;
//   }

//   public void setUid(BigInteger uid) {
//     this.uid = id;
//   }

//   public String getUsername() {
//     return username;
//   }

//   public void setUsername(String username) {
//     this.username = username;
//   }

//   public String getFirstName() {
//     return firstName;
//   }

//   public void setFirstName(String firstName) {
//     this.firstName = firstName;
//   }

//   public String getLastName() {
//     return lastName;
//   }

//   public void setLastName(String lastName) {
//     this.lastName = lastName;
//   }

//   public String getPassword() {
//     return password;
//   }

//   public void setPassword(String password) {
//     this.password = password;
//   }

//   public void set(User newUser) {

//     this.username = newUser.username;
//     this.password = newUser.password;
//     this.email = newUser.email;
//     this.firstName = newUser.firstName;
//     this.lastName = newUser.lastName;
//     this.age = age;
//   }

//   @Override
//   public boolean equals(Object o) {
//     if (o == this) {
//       return true;
//     }

//     if (!( o instanceof User )) {
//       return false;
//     }

//     User user = (User) o;

//     return this.uid.equals(user.getUid());

//   }

// }