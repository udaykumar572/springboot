package com.cts.project.pojos;

import javax.persistence.Entity;

import javax.persistence.Table;

import javax.persistence.Id;

import javax.persistence.Column;

 @Entity

 @Table(name="users")

 public class User {

  @Override

 public String toString() {

  return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="

   + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone +", gender=" + gender + ", age=" + age + "]";

 }

  @Id

  private String username;

  @Column(name="password",nullable=false,length=100)

  private String password;

  private String firstname;

  private String lastname;

  private String address;

  private int phone;

  private String gender;

  private int age;



 public int getAge() {

 return age;

 }

 public void setAge(int age) {

 this.age = age;

 }

 public String getGender() {

 return gender;

 }

 public void setGender(String gender) {

 this.gender = gender;

 }

 private String email;



  public String getUsername() {

  return username;

  }

  public void setUsername(String username) {

  this.username = username;

  }

  public String getPassword() {

  return password;

  }

  public void setPassword(String password) {

  this.password = password;

  }

  public String getFirstname() {

  return firstname;

  }

  public void setFirstname(String firstname) {

  this.firstname = firstname;

  }

  public String getLastname() {

  return lastname;

  }

  public void setLastname(String lastname) {

  this.lastname = lastname;

  }

  public String getEmail() {

  return email;

  }

  public void setEmail(String email) {

  this.email = email;

  }

  public String getAddress() {

  return address;

  }

  public void setAddress(String address) {

  this.address = address;

  }

  public int getPhone() {

  return phone;

  }

  public void setPhone(int phone) {

  this.phone = phone;

  }

 }






