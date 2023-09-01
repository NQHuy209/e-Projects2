/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Quang Huy
 */
public class TicketModel {
    private int id_ticket;
    private int id_users;
    private Date sale_date;
    private int id_schedule;
    private int id_room;

    public TicketModel() {
    }

    public TicketModel(int id_ticket, int id_users, Date sale_date, int id_schedule, int id_room) {
        this.id_ticket = id_ticket;
        this.id_users = id_users;
        this.sale_date = sale_date;
        this.id_schedule = id_schedule;
        this.id_room = id_room;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public Date getSale_date() {
        return sale_date;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }
    
    public void readRecord(ResultSet resultSet){
    
        try {
            this.id_ticket = resultSet.getInt("id_ticket");
            this.id_users = resultSet.getInt("id_users");
            this.sale_date = resultSet.getDate("sale_date");
            this.id_schedule = resultSet.getInt("id_schedule");
            this.id_room = resultSet.getInt("id_room");
        } catch (SQLException e) {
        }
        
    }
}
