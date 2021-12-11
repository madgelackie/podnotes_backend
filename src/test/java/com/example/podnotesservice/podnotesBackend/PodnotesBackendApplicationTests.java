package com.example.podnotesservice.podnotesBackend;

import com.example.podnotesservice.podnotesBackend.models.Episode;
import com.example.podnotesservice.podnotesBackend.repository.BookmarkRepository;
import com.example.podnotesservice.podnotesBackend.repository.EpisodeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class PodnotesBackendApplicationTests {

	@Autowired
	BookmarkRepository bookmarkRepository;

	@Autowired
	EpisodeRepository episodeRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void createEpisode(){
//		Episode episode1 = new Episode("Listen here", "http:blah", );
//		episodeRepository.save(episode1);
//	}



}
