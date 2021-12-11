package com.example.podnotesservice.podnotesBackend.controller;

import com.example.podnotesservice.podnotesBackend.models.Channel;
import com.example.podnotesservice.podnotesBackend.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChannelController {

    @Autowired
    ChannelRepository channelRepository;

    @GetMapping(value = "/channels")
    public ResponseEntity<List<Channel>> getAllChannels(){
        return new ResponseEntity<>(channelRepository.findAll(), HttpStatus.OK);
    }

}
