package com.kubernetes.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "bookmarks")
@Data
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;

    @JsonProperty("createdAt")
    private Instant createdAt;

    public Bookmark(String title, String url, Instant createdAt) {
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;
    }

    public Bookmark(Long id, String title, String url, Instant createdAt) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.createdAt = createdAt;
    }

    public Bookmark() {
    }
}
