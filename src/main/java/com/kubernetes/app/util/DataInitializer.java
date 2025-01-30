package com.kubernetes.app.util;

import com.kubernetes.app.domain.Bookmark;
import com.kubernetes.app.repository.BookmarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private BookmarkRepository bookmarkRepository;


    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark("TusharLabs", "www.tushar.com", Instant.now()));
        bookmarkRepository.save(new Bookmark("BuntyLabc", "www.tushar.com", Instant.now()));
        bookmarkRepository.save(new Bookmark("KalpeshLabs", "www.tushar.com", Instant.now()));
        bookmarkRepository.save(new Bookmark("DhirajLabs", "www.tushar.com", Instant.now()));
        bookmarkRepository.save(new Bookmark("BorkarLabs", "www.tushar.com", Instant.now()));
        bookmarkRepository.save(new Bookmark("PAtilLabs", "www.tushar.com", Instant.now()));
    }

}
