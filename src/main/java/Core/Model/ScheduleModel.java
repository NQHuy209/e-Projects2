/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Quang Huy
 */
public class ScheduleModel {
    private int schedule;
    private Date day;
    private Time showtime;

    public ScheduleModel() {
    }

    public ScheduleModel(int schedule, Date day, Time showtime) {
        this.schedule = schedule;
        this.day = day;
        this.showtime = showtime;
    }

    public int getSchedule() {
        return schedule;
    }

    public void setSchedule(int schedule) {
        this.schedule = schedule;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Time getShowtime() {
        return showtime;
    }

    public void setShowtime(Time showtime) {
        this.showtime = showtime;
    }

    

    
    
}
