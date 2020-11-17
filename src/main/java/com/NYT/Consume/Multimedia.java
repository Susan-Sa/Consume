package com.NYT.Consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Multimedia {

    private String url;
    private String format;
    private String height;
    private String width;
    private String type;
    private String subtype;
    private String caption;
    private String copyright;

    public Multimedia(String url, String format, String height, String width, String type, String subtype, String caption, String copyright) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "url='" + url + '\'' +
                ", format='" + format + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", caption='" + caption + '\'' +
                ", copyright='" + copyright + '\'' +
                '}';
    }
}
