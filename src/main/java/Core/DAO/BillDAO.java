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
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class BillDAO extends BaseDAO {
    public static List<BillModel> dataBill;
    
    public static void billList() {
        dataBill = new ArrayList<>();
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
    }
    
    public static void danhSachHoaDon() {
        dataBill = new ArrayList<>();
        String sql = "SELECT * FROM project2.bill INNER JOIN users ON bill.id_users = users.id_users";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                BillModel bill = new BillModel();
                bill.readRecord2(set);    
                dataBill.add(bill);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void danhSachDoanhthu() {
        dataBill = new ArrayList<>();
        String sql = "SELECT * FROM project2.bill INNER JOIN movie ON bill.id_movie = movie.id_movie";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                BillModel bill = new BillModel();
                bill.readRecord3(set);    
                dataBill.add(bill);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        String sql = "INSERT INTO project2.bill(id_movie, id_room_seat, price, day_started, time_started, time_bill, id_users) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            
            statement.setInt(1, billModel.getId_movie());
            statement.setInt(2, billModel.getId_room_seat());
            statement.setInt(3, billModel.getPrice());
            statement.setString(4, billModel.getDay_started());
            statement.setString(5, billModel.getTime_started());
            statement.setTimestamp(6, billModel.getTime_bill());
            statement.setInt(7, billModel.getId_users());
            

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public static void findbyDay(String text, int type) 
    {
        Connection();
        dataBill = new ArrayList<>();
        String sql = "SELECT * FROM bill INNER JOIN users ON bill.id_users = users.id_users WHERE users.name LIKE '%" + text + "%'";
        if (type == 1) {
            sql = "SELECT * FROM bill INNER JOIN users ON bill.id_users = users.id_users WHERE time_bill LIKE '%" + text + "%'";
        }
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                BillModel bill = new BillModel();
                bill.readRecord2(resultSet);
                dataBill.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public static void findByName(String name) {
        
        Connection();
        dataBill = new ArrayList<>();
        String sql = "SELECT * FROM bill INNER JOIN movie ON bill.id_movie = movie.id_movie WHERE movie.name LIKE '%" + name + "%'";
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                BillModel bill = new BillModel();
                bill.readRecord3(resultSet);
                dataBill.add(bill);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();

    }
    
    
}
