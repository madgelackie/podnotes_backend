package com.example.podnotesservice.podnotesBackend.repository;

import com.example.podnotesservice.podnotesBackend.models.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends JpaRepository <Episode, Long> {

}
