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

    public static List<RoomSeatModel> rSeatList() {
        List<RoomSeatModel> rSeatList = new ArrayList<>();
     
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
        return rSeatList;

    }
    
    public void add(RoomSeatModel roomS) {
        try {
            Connection();
            String sql = "INSERT INTO room_seat(seat_column, seat_row) VALUES (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getSeat_column());
            statement.setString(2, roomS.getSeat_row());

            statement.execute();
        } catch (SQLException e) {
        }
        Disconnect();
    }

    public void update(RoomSeatModel updateRoom) {
        RoomSeatModel roomS = new RoomSeatModel();
        try {
            Connection();
            String sql = "UPDATE room_seat SET seat_column=?, seat_row=? WHERE id = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getSeat_column());
            statement.setString(2, roomS.getSeat_row());

            statement.execute();
        } catch (SQLException e) {
        }
        Disconnect();
    }
    
    public void detele(int id) {
        RoomSeatModel roomS = new RoomSeatModel();
        try {
            Connection();
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM room_seat WHERE id = " + id;
            statement = conn.prepareStatement(sql);
            statement.setInt(1, roomS.getId_room_seat());
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + "");
        } catch (SQLException e) {
        }
    }
}
