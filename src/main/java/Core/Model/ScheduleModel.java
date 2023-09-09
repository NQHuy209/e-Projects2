/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class ScheduleModel {
    private int id_schedule;
    private String day;
    private String showtime;

    public ScheduleModel() {
    }

    public ScheduleModel(int id_schedule, String day, String showtime) {
        this.id_schedule = id_schedule;
        this.day = day;
        this.showtime = showtime;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public void readRecord(ResultSet resultSet) {
        try {
            this.id_schedule = resultSet.getInt("id_schedule");
            this.day = resultSet.getString("day");
            this.showtime = resultSet.getString("showtime");
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
