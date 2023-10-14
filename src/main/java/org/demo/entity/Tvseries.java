package org.demo.entity;

import java.net.URL;

public class Tvseries {
    int id;
    URL url;
    String name;
    String type;
    String langauge;

    public Tvseries() {
    }

    public Tvseries(int id, URL url, String name, String type, String langauge) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.type = type;
        this.langauge = langauge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    @Override
    public String toString() {
        return "Tvseries{" +
                "id=" + id +
                ", url=" + url +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", langauge='" + langauge + '\'' +
                '}';
    }
}
