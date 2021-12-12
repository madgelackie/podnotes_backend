package com.example.podnotesservice.podnotesBackend.controller;

import com.example.podnotesservice.podnotesBackend.models.Channel;
import com.example.podnotesservice.podnotesBackend.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChannelController {

    @Autowired
    ChannelRepository channelRepository;

    @GetMapping(value = "/channels")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity<List<Channel>> getAllChannels(){
        return new ResponseEntity<>(channelRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/channels/{id}")
    public ResponseEntity getChannel(@PathVariable Long id){
        return new ResponseEntity (channelRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/channels")
    @CrossOrigin(origins = "*", maxAge = 3600)
    public ResponseEntity createChannel(@RequestBody Channel channel){
        channelRepository.save(channel);
        return new ResponseEntity (channel, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/channels/{id}")
    public ResponseEntity<Channel> deleteShip(@PathVariable Long id) {
        Channel found = channelRepository.getById(id);
        channelRepository.delete(found);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
