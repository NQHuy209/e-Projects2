/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.Model.UsersModel;
import com.mysql.cj.protocol.Warning;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UsersDAO extends BaseDAO {

    public static int id;
    public static String username;
    public static String name;
    public static String address;
    public static String phone_number;
    public static String birthday;
    public static String gender;
    public static String email;
    public static String role;
    public static UsersDAO user = new UsersDAO();

    public static boolean checkAcc(JFrame frame, JTextField jTextField_UserName, JPasswordField jPasswordField1) {
        boolean check = true;
        Connection();
        String sql = "SELECT * FROM project2.users WHERE username = '" + jTextField_UserName.getText() + "'";

        try {
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                if (jPasswordField1.getText().equals(set.getString("password"))) {
                    id = set.getInt("id_users");
                    username = set.getString("username");
                    role = set.getString("role");
                    
                    check = true;

                } else {
                    check = false;
                    jPasswordField1.requestFocus();
                    JOptionPane.showMessageDialog(frame, "Mật khẩu chưa chính xác", null, JOptionPane.WARNING_MESSAGE);
                }
            } else {
                check = false;
                jTextField_UserName.requestFocus();
                JOptionPane.showMessageDialog(frame, "Tên người dùng không tồn tại", null, JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return check;

    }
    
    public static boolean checkAccount (JFrame jframe, JTextField jTextField_usernameS, int id_users, int type) {
        boolean check = true;
        Connection();
            String sql = "SELECT * FROM project2.users WHERE username = '" + jTextField_usernameS.getText() + "'";
        if (type == 1) {
            sql = "SELECT * FROM project2.users WHERE username = '" + jTextField_usernameS.getText() + "' AND id_users != " + id_users; 
        }    
        try {
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();
            if (set.next()) {
                check = false;
                JOptionPane.showMessageDialog(jframe, "Tên người dùng đã tồn tại!", null, JOptionPane.WARNING_MESSAGE);
            }
        }catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return check;
    }
    
    
    public static void signUp(UsersModel usersModel){
        String sql = "insert into users(name, address, phone_number, birthday, gender, email, username, password, role) values(?,?,?,?,?,?,?,?,?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, usersModel.getName() );
            statement.setString(2, usersModel.getAddress());
            statement.setString(3, usersModel.getPhone_number());
            statement.setString(4, usersModel.getBirthday());
            statement.setString(5, usersModel.getGender());
            statement.setString(6, usersModel.getEmail());
            statement.setString(7, usersModel.getUsername());
            statement.setString(8, usersModel.getPassword());
            statement.setString(9, usersModel.getRole());

            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public static List<UsersModel> userList;
    
    public static void UserAll() {
        Connection();
        userList = new ArrayList<>();                
        String sql = "select * from users";
        try {
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
        Disconnect();
    }

    
    public static void add(UsersModel usersModel) {
        
        String sql = "insert into users(name, address, phone_number, birthday, gender, email, username, password) values(?,?,?,?,?,?,?,?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, usersModel.getName() );
            statement.setString(2, usersModel.getAddress());
            statement.setString(3, usersModel.getPhone_number());
            statement.setString(4, usersModel.getBirthday());
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

   
    public static void update(UsersModel updateUsersModel) {
        Connection();
        String sql = "update users set name=?, address=?, phone_number=?, birthday=?, gender=?, email=?, username=?, password=?, role=? where id_users=?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, updateUsersModel.getName() );
            statement.setString(2, updateUsersModel.getAddress());
            statement.setString(3, updateUsersModel.getPhone_number());
            statement.setString(4, updateUsersModel.getBirthday());
            statement.setString(5, updateUsersModel.getGender());
            statement.setString(6, updateUsersModel.getEmail());
            statement.setString(7, updateUsersModel.getUsername());
            statement.setString(8, updateUsersModel.getPassword());
            statement.setString(9, updateUsersModel.getRole());
            statement.setInt(10, updateUsersModel.getId_users());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    
    public static void delete(int id) {
        
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

    public static void findByName(String name) {
        Connection();
        userList = new ArrayList<>();
        String sql = "select * from users where name LIKE '%" + name + "%'";
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                UsersModel user = new UsersModel();
                user.readRecord(resultSet);
                userList.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
}
