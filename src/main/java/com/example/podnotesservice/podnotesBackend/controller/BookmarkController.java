package com.example.podnotesservice.podnotesBackend.controller;

import com.example.podnotesservice.podnotesBackend.models.Bookmark;
import com.example.podnotesservice.podnotesBackend.models.Channel;
import com.example.podnotesservice.podnotesBackend.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookmarkController {

    @Autowired
    BookmarkRepository bookmarkRepository;

    @GetMapping(value = "/bookmarks")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Bookmark>> getAllBookmarks(){
        return new ResponseEntity<>(bookmarkRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/bookmarks")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity createBookmark(@RequestBody Bookmark bookmark){
        bookmarkRepository.save(bookmark);
        return new ResponseEntity (bookmark, HttpStatus.CREATED);
    }
}
