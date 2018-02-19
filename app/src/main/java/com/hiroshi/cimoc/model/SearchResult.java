package com.hiroshi.cimoc.model;

/**
 * Created by Hiroshi on 2018/2/15.
 */

public class SearchResult {

    private String sourceId;
    private String remoteId;
    private String title;
    private String cover;
    private String update;
    private String author;

    public SearchResult(String sourceId, String remoteId, String title, String cover, String update, String author) {
        this.sourceId = sourceId;
        this.remoteId = remoteId;
        this.title = title;
        this.cover = cover;
        this.update = update;
        this.author = author;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getRemoteId() {
        return remoteId;
    }

    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
