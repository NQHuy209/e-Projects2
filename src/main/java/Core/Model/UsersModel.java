/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.util.Date;

/**
 *
 * @author Quang Huy
 */
public class UsersModel {
    private int id_users;
    private String name;
    private String address;
    private int phone_number;
    private Date birthday;
    private String gender;
    private String email;
    private String username;
    private String password;

    public UsersModel() {
    }

    public UsersModel(int id_users, String name, String address, int phone_number, Date birthday, String gender, String email, String username, String password) {
        this.id_users = id_users;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
    
}
