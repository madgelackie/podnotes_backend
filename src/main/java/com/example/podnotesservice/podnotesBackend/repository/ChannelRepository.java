package com.example.podnotesservice.podnotesBackend.repository;

import com.example.podnotesservice.podnotesBackend.models.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

}
