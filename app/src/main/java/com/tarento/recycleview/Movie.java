package com.tarento.recycleview;

/**
 * Created by Priya on 2/22/2016.
 */
public class Movie {

    private String title;
    private String genre;
    private String year;
    private int image;

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Movie() {
    }

    public Movie(String title, String genre, String year, int image) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image=image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
