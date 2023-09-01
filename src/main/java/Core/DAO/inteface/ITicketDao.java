/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.TicketModel;
import java.util.List;

/**
 *
 * @author HieuPC
 */
public interface ITicketDao {
    public List<TicketModel> ListTocket();
    
    public TicketModel findById(int id);
    
    public TicketModel findByName(String name);
    
    public void add(TicketModel ticketModel);
    
    public void update(TicketModel updateticketModel);
    
    public void delete(int id);
}
