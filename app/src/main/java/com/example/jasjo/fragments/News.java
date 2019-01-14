package com.example.jasjo.fragments;

public class News {

    int image;
    String title;
    String url;

    public News(){

    }

    public News(int image, String title, String url) {
        this.image = image;
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return "News{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}