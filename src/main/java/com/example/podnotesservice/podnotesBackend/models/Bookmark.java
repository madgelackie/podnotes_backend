package com.example.podnotesservice.podnotesBackend.models;

public class Bookmark {

    private Long id;
    private String episodeTitle;
    private String episodeUrl;
    private float timeStamp;
    private String note;
    private Channel channel;

    public Bookmark(String episodeTitle, String episodeUrl, float timeStamp, String note, Channel channel) {
        this.episodeTitle = episodeTitle;
        this.episodeUrl = episodeUrl;
        this.timeStamp = timeStamp;
        this.note = note;
        this.channel = channel;
    }

//    default constructor, required to meet POJO requirements for object relational mapping
    public Bookmark (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }

    public String getEpisodeUrl() {
        return episodeUrl;
    }

    public void setEpisodeUrl(String episodeUrl) {
        this.episodeUrl = episodeUrl;
    }

    public float getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(float timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
