package com.kubernetes.app.controller;


import com.kubernetes.app.domain.Bookmark;
import com.kubernetes.app.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
public class BookmarkController {

    @Autowired
    private BookmarkService bookmarkService;


    @GetMapping
    public List<Bookmark> getBookmark() {
        List<Bookmark> bookmark = bookmarkService.getBookmark();
        return bookmark;
    }
}
