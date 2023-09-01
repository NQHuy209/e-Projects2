/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quang Huy
 */
public class MovieModel extends BaseModel {

    private int id;
    private String name;
    private String director;
    private Date release;
    private int duration;
    private String moviecol;
    private String cast;
    private String thumbnail;
    private String movie_form;
    private String movie_type;

    public MovieModel() {
    }

    public MovieModel(int id, String name, String director, Date release, int duration, String moviecol, String cast, String thumbnail, String movie_form, String movie_type) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.release = release;
        this.duration = duration;
        this.moviecol = moviecol;
        this.cast = cast;
        this.thumbnail = thumbnail;
        this.movie_form = movie_form;
        this.movie_type = movie_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getMoviecol() {
        return moviecol;
    }

    public void setMoviecol(String moviecol) {
        this.moviecol = moviecol;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getMovie_form() {
        return movie_form;
    }

    public void setMovie_form(String movie_form) {
        this.movie_form = movie_form;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public void readRecord(ResultSet resultSet) {
        try {
            this.id = resultSet.getInt("id");
            this.name = resultSet.getString("name");
            this.director = resultSet.getString("director");
            this.release = resultSet.getDate("release");
            this.duration = resultSet.getInt("duration");
            this.moviecol = resultSet.getString("moviecol");
            this.cast = resultSet.getString("cast");
            this.thumbnail = resultSet.getString("thumbnail");
            this.movie_form = resultSet.getString("movie_form");
            this.movie_type = resultSet.getString("movie_type");
        } catch (SQLException ex) {
            Logger.getLogger(MovieModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
