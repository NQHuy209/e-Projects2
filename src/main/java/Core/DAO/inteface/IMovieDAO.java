/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Core.DAO.inteface;

import Core.Model.MovieModel;
import java.util.List;

/**
 *
 * @author Thu Huyen
 */
public interface IMovieDAO {
    
    List<MovieModel> MovieAll();
    
    MovieModel findById(int id);
    
    MovieModel findByName(String name);
    
    void add(MovieModel movieModel);
    
    void update(MovieModel updateMovieModel);
    
    void delete(int id);
    
    
}
