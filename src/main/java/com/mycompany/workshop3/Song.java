package com.mycompany.workshop3;

import java.time.LocalDate;

/**
 *
 * @author Jaime Sanchez Mendieta
 */
public class Song {
    private int id;
    private String title;
    private String genre; 
    private String cover; 
    private String description;
    private Double duration;
    private LocalDate date;

    public Song() {
    }

    public Song(int id, String title, String genre, String cover, String description, Double duration, LocalDate Date) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
        this.duration = duration;
        this.date = Date;
    }
    
    @Override
    public String toString() {
        return "Id: "+id+" Title: "+title+" Genre: "+genre+" Cover: "+cover+" Description: "+description+" Duration: "+duration+" Date: "+date;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover the cover to set
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the duration
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * @return the Date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(LocalDate Date) {
        this.date = date;
    }
}
