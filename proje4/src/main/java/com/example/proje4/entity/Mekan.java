package com.example.proje4.entity;

import javax.persistence.*;



@Entity
public class Mekan {



    @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column

    private int rating;
    @Column
    private String mekanisim;
    @Column
    private String semt;
    @Column
    private String yorum;

    public Mekan(int id, int rating, String mekanisim, String semt, String yorum) {
        this.id = id;
        this.rating = rating;
        this.mekanisim = mekanisim;
        this.semt = semt;
        this.yorum = yorum;
    }

    public Mekan() {
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getMekanisim() {
        return mekanisim;
    }

    public String getSemt() {
        return semt;
    }

    public String getYorum() {
        return yorum;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setMekanisim(String mekanisim) {
        this.mekanisim = mekanisim;
    }

    public void setSemt(String semt) {
        this.semt = semt;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

}
