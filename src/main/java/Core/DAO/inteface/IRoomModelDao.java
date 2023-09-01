/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.RoomModel;
import java.util.List;

/**
 *
 * @author HieuPC
 */
public interface IRoomModelDao {
    
    public List<RoomModel> ListRoom();
    
    public RoomModel findById(int id);
    
    public RoomModel findByName(String name);
    
    public void add(RoomModel roomModel);
    
    public void update(RoomModel updateroomModel);
    
    public void delete(int id);
    
}
