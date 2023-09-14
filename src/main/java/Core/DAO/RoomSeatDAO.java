/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import static Core.DAO.BaseDAO.Connection;
import static Core.DAO.BaseDAO.conn;
import static Core.DAO.BaseDAO.statement;
import Core.DAO.inteface.IRoomSeatDAO;
import Core.Model.MovieModel;
import Core.Model.RoomSeatModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class RoomSeatDAO extends BaseDAO {
    public static List<RoomSeatModel> rSeatList;
    
    public static void RoomSeatAll() {
        Connection();
        rSeatList = new ArrayList<>();        
        String sql = "SELECT * FROM room_seat";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                RoomSeatModel rSeat = new RoomSeatModel();
                    rSeat.readRecord(set);    
                 rSeatList.add(rSeat);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public static void add(RoomSeatModel roomS) {
        try {
            Connection();
            String sql = "INSERT INTO room_seat(seat_column, seat_row, seat_code, type, price) VALUES (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getSeat_column());
            statement.setString(2, roomS.getSeat_row());
            statement.setString(3, roomS.getSeat_column() + roomS.getSeat_row());
            statement.setString(4, roomS.getType());
            statement.setInt(5, roomS.getPrice());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnect();
    }

    public static void update(RoomSeatModel updateRoom) {
        Connection();
        String sql = "UPDATE room_seat SET seat_column=?, seat_row=?, seat_code=?, type=?, price=? WHERE id_room_seat = ?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, updateRoom.getSeat_column());
            statement.setString(2, updateRoom.getSeat_row());
            statement.setString(3, updateRoom.getSeat_column() + updateRoom.getSeat_row());
            statement.setString(4, updateRoom.getType());
            statement.setInt(5, updateRoom.getPrice());
            statement.setInt(6, updateRoom.getId_room_seat());
            
            statement.execute();
        } catch (SQLException e) {
            Logger.getLogger(RoomSeatDAO.class.getName()).log(Level.SEVERE, null, e);

        }
        Disconnect();
    }
    
    public static void detele(int id) {
        String sql = "DELETE FROM room_seat WHERE id_room_seat =? ";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException e) {
            Logger.getLogger(RoomSeatDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        Disconnect();
    }
}
