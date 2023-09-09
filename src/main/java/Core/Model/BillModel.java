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
    public  int id;
    public  int id_movie;
    public  int id_room_seat;
    public  int price;
    public String day_started;
    public  String time_started;
    public Timestamp time_bill;
    
    

    public BillModel() {
    }

    public BillModel(int id, int id_movie, int id_room_seat, int price, String day_started, String time_started, Timestamp time_bill) {
        this.id = id;
        this.id_movie = id_movie;
        this.id_room_seat = id_room_seat;
        this.price = price;
        this.day_started = day_started;
        this.time_started = time_started;
        this.time_bill = time_bill;
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

    

    public void readRecord(ResultSet resultSet){
    
        try {
            this.id = resultSet.getInt("id");
            this.id_movie = resultSet.getInt("id_movie");
            this.id_room_seat = resultSet.getInt("id_room_seat");
            this.price = resultSet.getInt("price");
            this.day_started = resultSet.getString("day_started");
            this.time_started = resultSet.getString("time_started");
            this.time_bill = resultSet.getTimestamp("time_bill");
        } catch (SQLException e) {
        }
        
    }
    
    

}
