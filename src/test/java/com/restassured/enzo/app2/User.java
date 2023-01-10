package com.restassured.enzo.app2;

public class User {
    public String Email;
    public String Password;
    public String FullName;
    public User(){};
    public User(String mail, String psw, String name){
        this.Email=mail;
        this.Password = psw;
        this.FullName = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String fullName) {
        this.FullName = fullName;
    }
    
    
    

    
}
