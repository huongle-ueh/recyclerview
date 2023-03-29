package com.example.recyclerview;

import java.util.ArrayList;

public class Article {
    private int imageResource;
    private String title;
    private String content;

    public Article(int imageResource, String title, String content) {
        this.imageResource = imageResource;
        this.title = title;
        this.content = content;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
