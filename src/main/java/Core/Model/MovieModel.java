/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Model;

import java.util.Date;

/**
 *
 * @author Quang Huy
 */
public class MovieModel extends BaseModel {
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

    public MovieModel(String name, String director, Date release, int duration, String moviecol, String cast, String thumbnail, String movie_form, String movie_type) {
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
    
    
}
