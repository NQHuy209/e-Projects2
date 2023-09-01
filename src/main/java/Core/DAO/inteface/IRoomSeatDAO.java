/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.RoomSeatModel;
import java.util.List;

/**
 *
 * @author Quang Huy
 */
public interface IRoomSeatDAO {
    List<RoomSeatModel> rSeatList();
    
    void add(RoomSeatModel roomS);
    
    void update(RoomSeatModel updateRoom);
    
    void detele(int id);
}
