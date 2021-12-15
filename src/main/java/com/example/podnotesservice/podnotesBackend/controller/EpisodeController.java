package com.example.podnotesservice.podnotesBackend.controller;

import com.example.podnotesservice.podnotesBackend.models.Channel;
import com.example.podnotesservice.podnotesBackend.models.Episode;
import com.example.podnotesservice.podnotesBackend.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EpisodeController {

    @Autowired
    EpisodeRepository episodeRepository;

//    @GetMapping(value = "/episodes")
//    public ResponseEntity<List<Episode>> findByEpisodeTitle(
//            @RequestParam(name="episodeTitle", required = false) String episodeTitle
//    ){
//        if (episodeTitle != null){
//            return new ResponseEntity<>(episodeRepository.findByEpisodeTitle(episodeTitle), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(episodeRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value = "/episodes")
    public ResponseEntity<List<Episode>> getAllEpisodes(){
        return new ResponseEntity<>(episodeRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/episodes/{episodeURL}")
    public ResponseEntity getEpisode(@PathVariable String episodeURL) {
        return new ResponseEntity(episodeRepository.findByEpisodeURL(episodeURL), HttpStatus.OK);
    }

    @PostMapping(value = "/episodes")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity createEpisode(@RequestBody Episode episode){
        episodeRepository.save(episode);
        return new ResponseEntity (episode, HttpStatus.CREATED);
    }

}
