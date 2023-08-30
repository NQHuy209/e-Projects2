/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import static Core.DAO.BaseDAO.Connection;
import static Core.DAO.BaseDAO.conn;
import static Core.DAO.BaseDAO.statement;
import Core.Model.RoomTypeModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public class RoomTypeDAO extends BaseDAO {
    public static List<RoomTypeModel> getList() throws SQLException {
        List<RoomTypeModel> rTypeList = new ArrayList<>();
        Connection();
        try {
            String sql = "SELECT * FROM room_type";
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
        } catch (SQLException e) {
        }
        Connection();
        return null;
    }
    
    public void save() throws SQLException {
        Connection();
        RoomTypeModel roomS = new RoomTypeModel();
        try {
            String sql = "INSERT INTO room_type(category, price) VALUES (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getCategory());
            statement.setFloat(2, roomS.getPrice());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnection();
    }
    
    public void update(RoomTypeModel updateRoom) throws SQLException {
        Connection();
        RoomTypeModel roomS = new RoomTypeModel();
        try {
        String sql = "UPDATE room_type SET category=?, price=? WHERE id = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomS.getCategory());
            statement.setFloat(2, roomS.getPrice());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnection();
    }
    
    public void detele(int id) throws SQLException {
        Connection();
        RoomTypeModel roomS = new RoomTypeModel();
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM room_type WHERE id = " + id;
            statement = conn.prepareStatement(sql);
            statement.setInt(1, roomS.getId_room_type());
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + "");
        } catch (SQLException e) {
        }
    }
}
