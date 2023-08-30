/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

/**
 *
 * @author Quang Huy
 */
public class RoomModel {
    private int id_room;
    private String name;
    private int id_room_seat;
    private int id_room_type;

    public RoomModel() {
    }

    public RoomModel(int id_room, String name, int id_room_seat, int id_room_type) {
        this.id_room = id_room;
        this.name = name;
        this.id_room_seat = id_room_seat;
        this.id_room_type = id_room_type;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_room_seat() {
        return id_room_seat;
    }

    public void setId_room_seat(int id_room_seat) {
        this.id_room_seat = id_room_seat;
    }

    public int getId_room_type() {
        return id_room_type;
    }

    public void setId_room_type(int id_room_type) {
        this.id_room_type = id_room_type;
    }
    
    
}
