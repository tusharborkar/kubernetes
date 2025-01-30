package com.kubernetes.app.service;

import com.kubernetes.app.domain.Bookmark;
import com.kubernetes.app.repository.BookmarkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class BookmarkService {

    @Autowired
    private BookmarkRepository bookmarkRepository;

    private static final Logger logger = LoggerFactory.getLogger(BookmarkService.class);

    @Transactional(readOnly = true)
    public List<Bookmark> getBookmark() {
        List<Bookmark> all = bookmarkRepository.findAll();
        logger.info("Fetched Bookmarks: {}", all);
        return all;
    }


}
