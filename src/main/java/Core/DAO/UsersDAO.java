/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.DAO.inteface.IUserDAO;
import Core.Model.UsersModel;
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
public class UsersDAO extends BaseDAO implements IUserDAO{

    @Override
    public List<UsersModel> UserAll() {
        List<UsersModel>  userList = new ArrayList<>();                
        String sql = "select * from users";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                UsersModel user = new UsersModel();
                user.readRecord(resultSet);
                userList.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return userList;
    }

    @Override
    public void add(UsersModel usersModel) {
        
        String sql = "insert into users(name, address, phone_number, birthday, gender, email, username, password) values(?,?,?,?,?,?,?,?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, usersModel.getName() );
            statement.setString(2, usersModel.getAddress());
            statement.setString(3, usersModel.getPhone_number());
            statement.setDate(4, (Date) usersModel.getBirthday());
            statement.setString(5, usersModel.getGender());
            statement.setString(6, usersModel.getEmail());
            statement.setString(7, usersModel.getUsername());
            statement.setString(8, usersModel.getPassword());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void update(UsersModel updateUsersModel) {
        
        String sql = "update users set name=?, address=?, phone_number=?, birthday=?, gender=?, email=?, username=?, password=? where id_users=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
             statement.setString(1, updateUsersModel.getName() );
            statement.setString(2, updateUsersModel.getAddress());
            statement.setString(3, updateUsersModel.getPhone_number());
            statement.setDate(4, (Date) updateUsersModel.getBirthday());
            statement.setString(5, updateUsersModel.getGender());
            statement.setString(6, updateUsersModel.getEmail());
            statement.setString(7, updateUsersModel.getUsername());
            statement.setString(8, updateUsersModel.getPassword());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void delete(int id) {
        
        String sql = "delete from users where id_users =?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public UsersModel findByid(int id) {
        UsersModel user = null;
        
        String sql = "select * from users where id_users = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                user = new UsersModel();
                user.readRecord(resultSet);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return user;
    }

    @Override
    public UsersModel findByPhone(String phone) {
         UsersModel userbyphone = null;
        
        String sql = "select * from users where phone_number = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1,phone );
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                userbyphone= new UsersModel();
                userbyphone.readRecord(resultSet);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return userbyphone;
        
    }
    
}