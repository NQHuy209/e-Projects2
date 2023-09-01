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
    private int id_room;

    public RoomSeatModel() {
    }

    public RoomSeatModel(int id_room_seat, String seat_column, String seat_row, int id_room) {
        this.id_room_seat = id_room_seat;
        this.seat_column = seat_column;
        this.seat_row = seat_row;
        this.id_room = id_room;
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

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }
    
     public void readRecord(ResultSet resultSet){
    
        try {
            this.id_room_seat = resultSet.getInt("id_room_seat");
            this.seat_column = resultSet.getString("seat_column");
            this.seat_row = resultSet.getString("seat_row");
            this.id_room = resultSet.getInt("id_room");
        } catch (SQLException e) {
        }
        
    }
}
