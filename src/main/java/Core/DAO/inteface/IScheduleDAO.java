/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.ScheduleModel;
import java.util.List;

/**
 *
 * @author Thu Huyen
 */
public interface IScheduleDAO {
    
    List<ScheduleModel> ScheduleAll();
    
    void add(ScheduleModel scheduleModel);
    
    void update(ScheduleModel updateScheduleModel);
    
    void delete(int id);
    
    
}
