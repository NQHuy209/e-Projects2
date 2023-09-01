/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.DAO.inteface.ITicketDao;
import Core.Model.TicketModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class TicketDAO extends BaseDAO implements ITicketDao {

    @Override
    public List<TicketModel> ListTocket() {
        List<TicketModel> ticketList = new ArrayList<>();
        String sql = "Select * from ticket";

        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                TicketModel ticket = new TicketModel();
                ticket.readRecord(resultSet);
                ticketList.add(ticket);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return ticketList;

    }

    @Override
    public TicketModel findById(int id) {
        TicketModel ticket = null;
        String sql = "select * from room where id_ticket=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                ticket = new TicketModel();
                ticket.readRecord(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return ticket;

    }

    @Override
    public TicketModel findByName(String name) {
        TicketModel ticketByName = null;
        String sql = "select * from room where id_ticket=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                ticketByName = new TicketModel();
                ticketByName.readRecord(resultSet);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomModelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return ticketByName;
    }

    @Override
    public void add(TicketModel ticketModel) {
        String sql = "insert into ticket(id_users,sale_date,id_schedule,id_rooms) values ( ?, ?, ?, ?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, ticketModel.getId_users());
            statement.setDate(2, (Date) ticketModel.getSale_date());
            statement.setInt(3, ticketModel.getId_schedule());
            statement.setInt(4, ticketModel.getId_room());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void update(TicketModel updateticketModel) {
        String sql = "update ticket set id_users = ?, sale_date = ?, id_schedule = ? id_rooms = ? where id_ticket = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, updateticketModel.getId_users());
            statement.setDate(2, (Date) updateticketModel.getSale_date());
            statement.setInt(3, updateticketModel.getId_schedule());
            statement.setInt(4, updateticketModel.getId_room());
            statement.setInt(5, updateticketModel.getId_ticket());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void delete(int id) {
        String sql = "delete from room where id_room = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

}
