/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Quang Huy
 */
public class BaseDAO {

    static final String DB_NAME = "project2";
    static final String DB_USERNAME = "root";
    static final String DB_PWD = "12345678";
    static Connection conn = null;
    static PreparedStatement statement = null;
    
    public static String pathFolder = "C:\\Users\\Quang Huy\\Documents\\NetBeansProjects\\e-Projects2\\src\\main\\resoures\\image\\";

    public static void Connection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB_NAME, DB_USERNAME, DB_PWD);
        } catch (SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Disconnect() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static ImageIcon resizeImage(byte[] pic) {
        ImageIcon myImage = new ImageIcon(pic);
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(155, 190, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
}
