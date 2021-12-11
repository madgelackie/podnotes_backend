package com.example.podnotesservice.podnotesBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bookmarks")
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "timestamp")
    private float timestamp;

    @Column(name = "note")
    private String note;

    @JsonIgnoreProperties(value = "bookmarks")
    @ManyToOne
    @JoinColumn(name = "episode_id", nullable = false)
    private Episode episode;

    public Bookmark(float timestamp, String note, Episode episode) {
        this.timestamp = timestamp;
        this.note = note;
        this.episode = episode;
    }

    //    default constructor, required to meet POJO requirements for object relational mapping
    public Bookmark() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }
}


