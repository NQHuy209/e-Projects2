/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Quang Huy
 */
public class BillModel {

    public int id;
    public int id_movie;
    public int id_room_seat;
    public int price;
    public String day_started;
    public String time_started;
    public Timestamp time_bill;
    public int id_users;
    public String user;
    public String movie;

    public BillModel() {
    }

    public BillModel(int id, int id_movie, int id_room_seat, int price, String day_started, String time_started, Timestamp time_bill, int id_users) {
        this.id = id;
        this.id_movie = id_movie;
        this.id_room_seat = id_room_seat;
        this.price = price;
        this.day_started = day_started;
        this.time_started = time_started;
        this.time_bill = time_bill;
        this.id_users = id_users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_movie() {
        return id_movie;
    }

    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    public int getId_room_seat() {
        return id_room_seat;
    }

    public void setId_room_seat(int id_room_seat) {
        this.id_room_seat = id_room_seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDay_started() {
        return day_started;
    }

    public void setDay_started(String day_started) {
        this.day_started = day_started;
    }

    public String getTime_started() {
        return time_started;
    }

    public void setTime_started(String time_started) {
        this.time_started = time_started;
    }

    public Timestamp getTime_bill() {
        return time_bill;
    }

    public void setTime_bill(Timestamp time_bill) {
        this.time_bill = time_bill;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    
    

    public void readRecord(ResultSet resultSet) {

        try {
            this.id = resultSet.getInt("id");
            this.id_movie = resultSet.getInt("id_movie");
            this.id_room_seat = resultSet.getInt("id_room_seat");
            this.price = resultSet.getInt("price");
            this.day_started = resultSet.getString("day_started");
            this.time_started = resultSet.getString("time_started");
            this.time_bill = resultSet.getTimestamp("time_bill");
            this.id_users = resultSet.getInt("id_users");
        } catch (SQLException e) {
        }

    }
    
    public void readRecord2(ResultSet resultSet){
    
        try {
            this.id = resultSet.getInt("id");
            this.price = resultSet.getInt("price");
            this.time_bill = resultSet.getTimestamp("time_bill");
            this.user = resultSet.getString("users.name");
        } catch (SQLException e) {
        }
        
    }
    
    public void readRecord3(ResultSet resultSet){
    
        try {
            this.id = resultSet.getInt("id");
            this.id_movie = resultSet.getInt("id_movie");
            this.day_started = resultSet.getString("day_started");
            this.time_started = resultSet.getString("time_started");
            this.time_bill = resultSet.getTimestamp("time_bill");
            this.price = resultSet.getInt("price");
            this.movie = resultSet.getString("movie.name");
        } catch (SQLException e) {
        }
        
    }
}
