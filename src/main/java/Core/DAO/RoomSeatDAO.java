/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.Model.RoomSeatModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public class RoomSeatDAO extends BaseDAO  {
    public static List<RoomSeatModel> getList() throws SQLException {
        List<RoomSeatModel> rSeatList = new ArrayList<>();
        Connection();
        try {
            String sql = "SELECT * FROM room_seat";
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
        } catch (SQLException e) {
        }
        Connection();
        return null;
     }
    
    public void save() throws SQLException {
        Connection();
        RoomSeatModel roomS = new RoomSeatModel();
        try {
            String sql = "INSERT INTO room_seat(seat_column, seat_row) VALUES (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getSeat_column());
            statement.setString(2, roomS.getSeat_row());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnection();
    }

    public void update(RoomSeatModel updateRoom) throws SQLException {
        Connection();
        RoomSeatModel roomS = new RoomSeatModel();
        try {
        String sql = "UPDATE room_seat SET seat_column=?, seat_row=? WHERE id = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getSeat_column());
            statement.setString(2, roomS.getSeat_row());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnection();
    }
    
    public void detele(int id) throws SQLException {
        Connection();
        RoomSeatModel roomS = new RoomSeatModel();
        try {
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
