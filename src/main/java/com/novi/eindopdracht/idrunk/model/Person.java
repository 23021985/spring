//package com.novi.eindopdracht.idrunk.model;
//import javax.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Table
//public class Person {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @Column
//    private String firstName;
//
//    @Column
//    private String lastName;
//
//    @Column
//    private String mail;
//
//    @Column
//    private String password;
//
//    @Column
//    private int age;
//
//    @Column
//    private String apikey;
//
//    @OneToMany(
//            targetEntity = com.novi.eindopdracht.idrunk.model.Authority.class,
//            mappedBy = "mail",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch = FetchType.EAGER)
//    private Set<com.novi.eindopdracht.idrunk.model.Authority> authorities = new HashSet<>();
//
//    public Person() {
//    }
//
//    public String getApikey() {
//        return apikey;
//    }
//
//    public void setApikey(String apikey) {
//        this.apikey = apikey;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return firstName;
//    }
//
//    public void setName(String name) {
//        this.firstName = name;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getMail() {
//        return mail;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Set<Authority> getAuthorities() { return authorities; }
//    public void addAuthority(Authority authority) {
//        this.authorities.add(authority);
//    }
//    public void removeAuthority(Authority authority) {
//        this.authorities.remove(authority);
//    }
//
//}
