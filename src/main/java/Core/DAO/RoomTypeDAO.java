/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import static Core.DAO.BaseDAO.Connection;
import static Core.DAO.BaseDAO.conn;
import static Core.DAO.BaseDAO.statement;
import Core.DAO.inteface.IRoomTypeDAO;
import Core.Model.RoomSeatModel;
import Core.Model.RoomTypeModel;
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
public class RoomTypeDAO extends BaseDAO implements IRoomTypeDAO {
    @Override
    public List<RoomTypeModel> rTypeList() {
        List<RoomTypeModel> rTypeList = new ArrayList<>();
     
        String sql = "SELECT * FROM room_seat";

        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                RoomTypeModel roomT = new RoomTypeModel();
                    roomT.readRecord(set);    
                 rTypeList.add(roomT);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rTypeList;

    }
    
    @Override
    public void add(RoomTypeModel roomT) {
        
        try {
            Connection();
            String sql = "INSERT INTO room_type(category, price) VALUES (?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomT.getCategory());
            statement.setFloat(2, roomT.getPrice());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnect();
    }
    
    @Override
    public void update(RoomTypeModel updateRoom){
        
        RoomTypeModel roomT = new RoomTypeModel();
        try {
        Connection();
        String sql = "UPDATE room_type SET category=?, price=? WHERE id = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, roomT.getCategory());
            statement.setFloat(2, roomT.getPrice());
            
            statement.execute();
        } catch (SQLException e) {
        }
        Disconnect();
    }
    
    @Override
    public void delete(int id) {
        RoomTypeModel roomT = new RoomTypeModel();
        try {
            Connection();
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM room_type WHERE id = " + id;
            statement = conn.prepareStatement(sql);
            statement.setInt(1, roomT.getId_room_type());
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + "");
        } catch (SQLException e) {
        }
    }

    
    

    
}
