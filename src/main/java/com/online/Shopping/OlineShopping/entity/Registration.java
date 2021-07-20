package com.online.Shopping.OlineShopping.entity;

import javax.persistence.*;

@Entity
@Table(name = "Registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String Firstname;
    private String Email;
    private Long Mobile;
    private String Password;

    public Registration() {
    }

    public Registration(Long id, String firstname, String email, Long mobile, String password) {
        this.id = id;
        Firstname = firstname;
        Email = email;
        Mobile = mobile;
        Password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getMobile() {
        return Mobile;
    }

    public void setMobile(Long mobile) {
        Mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile=" + Mobile +
                ", Password='" + Password + '\'' +
                '}';
    }
}
