package com.example.podnotesservice.podnotesBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "channels")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "channel_url")
    private String channelUrl;

    @Column(name = "channel_title")
    private String channelTitle;

    @JsonIgnoreProperties(value = "channel")
    @OneToMany(mappedBy = "channel", fetch = FetchType.LAZY)
    private List<Episode> episodes;

    public Channel(String channelTitle, String channelUrl) {
        this.channelTitle = channelTitle;
        this.channelUrl = channelUrl;
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
