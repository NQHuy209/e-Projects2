/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.Model.MovieModel;
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
public class MovieDAO extends BaseDAO {
    public static List<MovieModel> movieList;
    
    public static void MovieAll() {
        Connection();
        movieList = new ArrayList<>();
        String sql = "SELECT * from movie";
        try {
            
            statement = conn.prepareStatement(sql);
            ResultSet set = statement.executeQuery();

            while(set.next()) {
                MovieModel movie = new MovieModel();
                movie.readRecord(set);
                movieList.add(movie);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
    
    public static List<MovieModel> getMovieStatus() {
        List<MovieModel> movieStatus = new ArrayList<>();
        Connection();
        String sql = "select * from movie where status = 'Đang chiếu'";
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                MovieModel movie = new MovieModel();
                movie.readRecord(resultSet);
                movieStatus.add(movie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return movieStatus;
    }

    public static void findByName(String name) {
        
        Connection();
        movieList = new ArrayList<>();
        String sql = "select * from movie where name LIKE '%" + name + "%'";
        try {
            statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                MovieModel movie = new MovieModel();
                movie.readRecord(resultSet);
                movieList.add(movie);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();

    }

    public static void add(MovieModel movieModel) {
        Connection();
        String sql = "INSERT INTO movie(name, director, movie.release, duration, moviecol, casting, thumbnail, movie_form, movie_type, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, movieModel.getName());
            statement.setString(2, movieModel.getDirector());
            statement.setString(3, movieModel.getRelease());
            statement.setInt(4, movieModel.getDuration());
            statement.setString(5, movieModel.getMoviecol());
            statement.setString(6, movieModel.getCasting());
            statement.setString(7, movieModel.getThumbnail());
            statement.setString(8, movieModel.getMovie_form());
            statement.setString(9, movieModel.getMovie_type());
            statement.setString(10, movieModel.getStatus());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    public static void update(MovieModel updateMovieModel) {
        Connection();
        String sql = "UPDATE movie SET name =?, director =?, movie.release =?, duration =?, moviecol =?, casting =?, thumbnail =?, movie_form =?, movie_type =?, status =? WHERE id_movie =?";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, updateMovieModel.getName());
            statement.setString(2, updateMovieModel.getDirector());
            statement.setString(3, updateMovieModel.getRelease());
            statement.setInt(4, updateMovieModel.getDuration());
            statement.setString(5, updateMovieModel.getMoviecol());
            statement.setString(6, updateMovieModel.getCasting());
            statement.setString(7, updateMovieModel.getThumbnail());
            statement.setString(8, updateMovieModel.getMovie_form());
            statement.setString(9, updateMovieModel.getMovie_type());
            statement.setString(10, updateMovieModel.getStatus());
            statement.setInt(11, updateMovieModel.getId());

            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    public static void delete(int id) {
         String sql = "delete from movie where id_movie = ?";
         
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }
}
