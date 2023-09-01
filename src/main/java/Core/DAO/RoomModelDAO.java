/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.DAO.inteface.IRoomModelDao;
import Core.Model.RoomModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class RoomModelDAO extends BaseDAO implements IRoomModelDao{

    @Override
    public List<RoomModel> ListRoom() {
        List<RoomModel> roomList = new ArrayList<>();
        String sql = "Select * from room";
        
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
            while (set.next()) {                
                RoomModel room = new RoomModel();
                room.readRecord(set);
                roomList.add(room);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Disconnect();
        return roomList;
    }

    @Override
    public RoomModel findById(int id) {
        RoomModel room = null;
        String sql = "select * from room where id_room=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                room = new RoomModel();
                room.readRecord(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return room;
        
    }

    @Override
    public RoomModel findByName(String name) {
        RoomModel roomByName = null;
        String sql = "select * from room where name=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                roomByName = new RoomModel();
                roomByName.readRecord(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return roomByName;
    }

    
    @Override
    public void add(RoomModel roomModel) {
        String sql = "insert into room(name,id_room_seat,id_room_type) values ( ?, ?, ?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomModel.getName());
            statement.setInt(2,roomModel.getId_room_seat());
            statement.setInt(3, roomModel.getId_room_type());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void update(RoomModel updateroomModel) {
        String sql = "update room set name = ?, id_room_seat = ?, id_room_type = ? where id_room = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, updateroomModel.getName());
            statement.setInt(2, updateroomModel.getId_room_seat());
            statement.setInt(3, updateroomModel.getId_room_type());
            statement.setInt(4, updateroomModel.getId_room());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void delete(int id) {
        String sql = "delete from room where id_room = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
}
