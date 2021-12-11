package com.example.podnotesservice.podnotesBackend.components;

import com.example.podnotesservice.podnotesBackend.models.Bookmark;
import com.example.podnotesservice.podnotesBackend.models.Channel;
import com.example.podnotesservice.podnotesBackend.models.Episode;
import com.example.podnotesservice.podnotesBackend.repository.BookmarkRepository;
import com.example.podnotesservice.podnotesBackend.repository.ChannelRepository;
import com.example.podnotesservice.podnotesBackend.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookmarkRepository bookmarkRepository;

    @Autowired
    EpisodeRepository episodeRepository;

    @Autowired
    ChannelRepository channelRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Channel channelA = new Channel("Podcast News", "httpABCD");
        channelRepository.save(channelA);

        Channel channelB = new Channel("DevStories", "http://3456");
        channelRepository.save(channelB);

        Episode episode1 = new Episode("Listen To This", "http:...", channelA);
        episodeRepository.save(episode1);

        Episode episode2 = new Episode("Now listen to this", "http:...hjfj", channelB);
        episodeRepository.save(episode2);

        Bookmark bookmark1 = new Bookmark(7.9, "blalalaslsld", episode1);
        bookmarkRepository.save(bookmark1);

        Bookmark bookmark2 = new Bookmark(167.9, "blalalaslsld", episode1);
        bookmarkRepository.save(bookmark2);

        Bookmark bookmark3 = new Bookmark(200, "blalalaslsld", episode2);
        bookmarkRepository.save(bookmark3);

        Bookmark bookmark4 = new Bookmark(58, "blalalaslsld", episode2);
        bookmarkRepository.save(bookmark4);

        Bookmark bookmark5 = new Bookmark(7684.1256, "blalalaslsld", episode2);
        bookmarkRepository.save(bookmark5);

//        add episode to channel episode list:
        channelA.addEpisode(episode1);
        episode2.addBookmark(bookmark3);


    }

}
