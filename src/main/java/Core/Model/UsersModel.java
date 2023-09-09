/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class UsersModel {
    private int id_users;
    private String name;
    private String address;
    private String phone_number;
    private String birthday;
    private String gender;
    private String email;
    private String username;
    private String password;
    private String role;

    public UsersModel() {
    }

    public UsersModel(int id_users, String name, String address, String phone_number, String birthday, String gender, String email, String username, String password, String role) {
        this.id_users = id_users;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    public void readRecord(ResultSet resultSet) {
        try {
            this.id_users = resultSet.getInt("id_users");
            this.name = resultSet.getString("name");
            this.address = resultSet.getString("address");
            this.phone_number = resultSet.getString("phone_number");
            this.birthday = resultSet.getString("birthday");
            this.gender = resultSet.getString("gender");
            this.email = resultSet.getString("email");
            this.username = resultSet.getString("username");
            this.password = resultSet.getString("password");
            this.role = resultSet.getString("role");
        } catch (SQLException ex) {
            Logger.getLogger(MovieModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
