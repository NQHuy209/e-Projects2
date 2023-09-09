/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Quang Huy
 */
public class RoomSeatModel {
    private int id_room_seat;
    private String seat_column;
    private String seat_row;
    private String seat_code;
    private String type;
    private int price;

    public RoomSeatModel(int id_room_seat, String seat_column, String seat_row, String seat_code, String type, int price) {
        this.id_room_seat = id_room_seat;
        this.seat_column = seat_column;
        this.seat_row = seat_row;
        this.seat_code = seat_code;
        this.type = type;
        this.price = price;
    }

    public RoomSeatModel() {
    }

    public int getId_room_seat() {
        return id_room_seat;
    }

    public void setId_room_seat(int id_room_seat) {
        this.id_room_seat = id_room_seat;
    }

    public String getSeat_column() {
        return seat_column;
    }

    public void setSeat_column(String seat_column) {
        this.seat_column = seat_column;
    }

    public String getSeat_row() {
        return seat_row;
    }

    public void setSeat_row(String seat_row) {
        this.seat_row = seat_row;
    }

    public String getSeat_code() {
        return seat_code;
    }

    public void setSeat_code(String seat_code) {
        this.seat_code = seat_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    
     public void readRecord(ResultSet resultSet){
    
        try {
            this.id_room_seat = resultSet.getInt("id_room_seat");
            this.seat_column = resultSet.getString("seat_column");
            this.seat_row = resultSet.getString("seat_row");
            this.seat_code = resultSet.getString("seat_code");
            this.type = resultSet.getString("type");
            this.price = resultSet.getInt("price");
        } catch (SQLException e) {
        }
        
    }
}
