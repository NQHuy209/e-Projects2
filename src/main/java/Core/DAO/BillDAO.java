/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.Model.BillModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class BillDAO extends BaseDAO {
    public static List<BillModel> billList() {
        List<BillModel> dataBill = new ArrayList<>();
        String sql = "SELECT * FROM project2.bill";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                BillModel bill = new BillModel();
                bill.readRecord(set);    
                dataBill.add(bill);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataBill;
    }
    
    public static boolean checkBill(int idMovie, int idSeat, String day, String time) {
        boolean flag = false;
        String sql = "SELECT * FROM project2.bill WHERE id_movie = " + idMovie + " AND id_room_seat = " + idSeat + " AND day_started = '" + day + "' AND time_started = '" + time + "'";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                flag = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    public static void add(BillModel billModel) {
        Connection();
        String sql = "INSERT INTO project2.bill(id_movie, id_room_seat, price, day_started, time_started, time_bill) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, billModel.getId_movie());
            statement.setInt(2, billModel.getId_room_seat());
            statement.setInt(3, billModel.getPrice());
            statement.setString(4, billModel.getDay_started());
            statement.setString(5, billModel.getTime_started());
            statement.setTimestamp(6, billModel.getTime_bill());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
}
