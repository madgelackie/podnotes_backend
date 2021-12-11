package com.example.podnotesservice.podnotesBackend.models;

public class Channel {
    private String channelUrl;
    private String channelTitle;
    private Long id;

    public Channel(){

    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Channel(String channelUrl, String channelTitle) {
        this.channelUrl = channelUrl;
        this.channelTitle = channelTitle;


    }
}
