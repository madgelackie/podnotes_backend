package com.example.podnotesservice.podnotesBackend.repository;

import com.example.podnotesservice.podnotesBackend.models.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

}
