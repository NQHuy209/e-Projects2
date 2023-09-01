/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.RoomTypeModel;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public interface IRoomTypeDAO {
    List<RoomTypeModel> rTypeList();
    
    void add (RoomTypeModel roomT);
    
    void update (RoomTypeModel updateRoom);
    
    void delete(int id);
            
            
}
