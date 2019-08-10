package com.math.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project: MathAngular
 * Package: com.math.entity
 * <p>
 * User: jeremytouch
 * Date: 8/9/19
 * Time: 3:36 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="highscore")

public class HighScoreEntity {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;
    @Column(name = "user")
    private String user;
    @Column(name = "score")
    private int score;

    public HighScoreEntity() {

    }
    public HighScoreEntity(String user, int score) {
        this.user = user;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
