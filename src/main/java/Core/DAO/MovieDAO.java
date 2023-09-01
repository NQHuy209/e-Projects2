/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.DAO;

import Core.DAO.inteface.IMovieDAO;
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
public class MovieDAO extends BaseDAO implements IMovieDAO {

    @Override
    public List<MovieModel> MovieAll() {
        List<MovieModel> movieList = new ArrayList<>();
     
        String sql = "SELECT * from movie";

        try {
            Connection();
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
        return movieList;

    }

    @Override
    public MovieModel findById(int id) {
        MovieModel movie = null;
        String sql = "select * from movie where id_movie = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                movie = new MovieModel();
                movie.readRecord(resultSet);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return movie;
        
    }

    @Override
    public MovieModel findByName(String name) {
        
        MovieModel moviebyname = null;
        String sql = "select * from movie where name = ?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, name);
            
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()) {
                moviebyname = new MovieModel();
                moviebyname.readRecord(resultSet);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
        return moviebyname;

    }

    @Override
    public void add(MovieModel movieModel) {
        
        String sql = "insert into movie(name, director, relase, duration, moviecol, cast, thumbnail, movie_from, movie_type) vlaues(?,?,?,?,?,?,?,?,?)";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, movieModel.getName());
            statement.setString(2, movieModel.getDirector());
            statement.setDate(3, (Date) movieModel.getRelease());
            statement.setInt(4, movieModel.getDuration());
            statement.setString(5, movieModel.getMoviecol());
            statement.setString(6, movieModel.getCast());
            statement.setString(7, movieModel.getThumbnail());
            statement.setString(8, movieModel.getMovie_form());
            statement.setString(9, movieModel.getMovie_type());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void update(MovieModel updateMovieModel) {
        
        String sql = "update movie set name =?, director =?, relase=?, duration =?, moviecol=?, cast=?, thumbnail=?, movie_from=?, movie_type=? where id_movie=?";
        try {
            Connection();
            statement = conn.prepareStatement(sql);
            statement.setString(1, updateMovieModel.getName());
            statement.setString(2, updateMovieModel.getDirector());
            statement.setDate(3, (Date) updateMovieModel.getRelease());
            statement.setInt(4, updateMovieModel.getDuration());
            statement.setString(5, updateMovieModel.getMoviecol());
            statement.setString(6, updateMovieModel.getCast());
            statement.setString(7, updateMovieModel.getThumbnail());
            statement.setString(8, updateMovieModel.getMovie_form());
            statement.setString(9, updateMovieModel.getMovie_type());
            
            statement.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        Disconnect();
    }

    @Override
    public void delete(int id) {
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
