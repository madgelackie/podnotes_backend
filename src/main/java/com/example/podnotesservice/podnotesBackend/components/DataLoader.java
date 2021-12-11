package com.example.podnotesservice.podnotesBackend.components;

import com.example.podnotesservice.podnotesBackend.models.Bookmark;
import com.example.podnotesservice.podnotesBackend.models.Episode;
import com.example.podnotesservice.podnotesBackend.repository.BookmarkRepository;
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

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        Episode episode1 = new Episode("Listen To This", "http:...");
        episodeRepository.save(episode1);

        Episode episode2 = new Episode("Now listen to this", "http:...hjfj");
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

    }

}
