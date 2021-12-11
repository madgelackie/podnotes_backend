package com.example.podnotesservice.podnotesBackend.models;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private Long id;
    private String channelUrl;
    private String channelTitle;
    private List<Episode> episodes;

    public Channel(String channelUrl, String channelTitle) {
        this.channelUrl = channelUrl;
        this.channelTitle = channelTitle;
        this.episodes = new ArrayList<>();
    }

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

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public void addEpisode(Episode episode){
        this.episodes.add(episode);
    }
}
