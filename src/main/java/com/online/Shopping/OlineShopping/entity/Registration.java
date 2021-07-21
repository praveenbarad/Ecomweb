package com.online.Shopping.OlineShopping.entity;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Entity
@Table(name = "Registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String Firstname;
    private String Email;
    private Long Mobile;
  //  private String Password;
    private String  password;

    public Registration() {
    }

    public Registration(Long id, String firstname, String email, Long mobile, String password) {
        this.id = id;
        Firstname = firstname;
        Email = email;
        Mobile = mobile;
        this.password = password;
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
        return password;
    }

    public void setPassword(String password) {
        this.password = encriptings(password);
    }

    private static String encriptings(String Password)
    {
        return Base64.getEncoder().encodeToString(Password.getBytes());
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Email='" + Email + '\'' +
                ", Mobile=" + Mobile +
                ", password='" + password + '\'' +
                '}';
    }
}
