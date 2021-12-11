package com.example.podnotesservice.podnotesBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "episodes")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "episode_title")
    private String episodeTitle;

    @Column(name = "episode_url")
    private String episodeURL;

    @JsonIgnoreProperties(value = "episode")
    @OneToMany(mappedBy = "episode", fetch = FetchType.LAZY)
    private List<Bookmark> bookmarks;

    @JsonIgnoreProperties(value = "episodes")
    @ManyToOne
    @JoinColumn(name = "channel_id", nullable = false)
    private Channel channel;

    public Episode(String episodeTitle, String episodeURL, Channel channel) {
        this.episodeTitle = episodeTitle;
        this.episodeURL = episodeURL;
        this.bookmarks = new ArrayList<>();
        this.channel = channel;
    }

//    default constructor, required for ORM
    public Episode (){

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

    public String getEpisodeURL() {
        return episodeURL;
    }

    public void setEpisodeURL(String episodeURL) {
        this.episodeURL = episodeURL;
    }

    public List<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public void addBookmark(Bookmark bookmark){
        this.bookmarks.add(bookmark);
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
