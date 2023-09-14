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
public class RoomModel {
    private int id_room;
    private String name;
    

    public RoomModel() {
    }

    public RoomModel(int id_room, String name) {
        this.id_room = id_room;
        this.name = name;
        
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

    
    
    public void readRecord(ResultSet resultSet){
    
        try {
            this.id_room = resultSet.getInt("id_room");
            this.name = resultSet.getString("name");
            
        } catch (SQLException e) {
        }
        
    }
}
