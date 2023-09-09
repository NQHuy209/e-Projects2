/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.Model.ScheduleModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class ScheduleDAO extends BaseDAO {
    public static int id;
    public static String day;
    public static String showtime;
    
    public static List<ScheduleModel> sList;
    
    public static void ScheduleAll() {
        Connection();
        sList = new ArrayList<>();                
        String sql = "select * from schedule";
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                ScheduleModel schedule = new ScheduleModel();
                schedule.readRecord(resultSet);
                sList.add(schedule);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScheduleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    
    public static void add(ScheduleModel sModel) {
        
        String sql = "insert into schedule(day, showtime) values(?,?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, sModel.getDay());
            statement.setString(2, sModel.getShowtime());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

   
    public static void update(ScheduleModel updatesModel) {
        Connection();
        String sql = "update schedule set day=?, showtime=? where id_schedule=?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, updatesModel.getDay());
            statement.setString(2, updatesModel.getShowtime());
            statement.setInt(3, updatesModel.getId_schedule());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    
    public static void delete(int id_schedule) {
        
        String sql = "delete from schedule where id_schedule =?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id_schedule);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    
}
