/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.UsersModel;
import java.util.List;

/**
 *
 * @author Thu Huyen
 */
public interface IUserDAO {
    
    List<UsersModel> UserAll();
    
    void add(UsersModel usersModel);
    
    void update(UsersModel updateUsersModel);
    
    void delete(int id);
    
    UsersModel findByid(int id);
    
    UsersModel findByPhone(String phone);
}
