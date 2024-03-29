package com.company.requests;

import java.io.Serializable;

public class GetBooks implements Serializable {
    private String method;
    private String title;
    private String author;
    private String science_field;
    private String key_words;

    public GetBooks() {
    }

    public GetBooks(String title, String author, String science_field,
                String key_words, String method){
        this.title=title;
        this.author=author;
        this.science_field=science_field;
        this.key_words=key_words;
        this.method=method;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getScience_field() {
        return science_field;
    }
    public void setScience_field(String science_field) {
        this.science_field = science_field;
    }

    public String getKey_words() {
        return key_words;
    }
    public void setKey_words(String key_words) {
        this.key_words = key_words;
    }

    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
}
