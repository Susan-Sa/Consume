package com.NYT.Consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results{

    private String section;
    private String subsection;
    private String title;
    private String url;
    private String uri;
    private String byline;
    private String item_type;
    private String updated_date;
    private String created_date;
    private String published_date;
    private String material_type_facet;
    private String kicker;
    private List<String> des_facet = new ArrayList<String>();
    private List<String> org_facet = new ArrayList<String>();
    private List<String> per_facet = new ArrayList<String>();
    private List<String> geo_facet = new ArrayList<String>();
    private List<Multimedia> multimedia = new ArrayList<Multimedia>();
    private String short_url;

    public Results(String section, String subsection, String title, String url, String uri, String byline, String item_type, String updated_date, String created_date, String published_date, String material_type_facet, String kicker, List<String> des_facet, List<String> org_facet, List<String> per_facet, List<String> geo_facet, List<Multimedia> multimedia, String short_url) {
        this.section = section;
        this.subsection = subsection;
        this.title = title;
        this.url = url;
        this.uri = uri;
        this.byline = byline;
        this.item_type = item_type;
        this.updated_date = updated_date;
        this.created_date = created_date;
        this.published_date = published_date;
        this.material_type_facet = material_type_facet;
        this.kicker = kicker;
        this.des_facet = des_facet;
        this.org_facet = org_facet;
        this.per_facet = per_facet;
        this.geo_facet = geo_facet;
        this.multimedia = multimedia;
        this.short_url = short_url;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }

    public List<String> getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(List<String> des_facet) {
        this.des_facet = des_facet;
    }

    public List<String> getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(List<String> org_facet) {
        this.org_facet = org_facet;
    }

    public List<String> getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(List<String> per_facet) {
        this.per_facet = per_facet;
    }

    public List<String> getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(List<String> geo_facet) {
        this.geo_facet = geo_facet;
    }

    public List<Multimedia> getMultimedia() {
        return multimedia;
    }

    public void setMultimedia() {
        this.multimedia = multimedia;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    @Override
    public String toString() {
        return "Results{" +
                "section='" + section + '\'' +
                ", subsection='" + subsection + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                ", byline='" + byline + '\'' +
                ", item_type='" + item_type + '\'' +
                ", updated_date='" + updated_date + '\'' +
                ", created_date='" + created_date + '\'' +
                ", published_date='" + published_date + '\'' +
                ", material_type_facet='" + material_type_facet + '\'' +
                ", kicker='" + kicker + '\'' +
                ", des_facet=" + des_facet +
                ", org_facet=" + org_facet +
                ", per_facet=" + per_facet +
                ", geo_facet=" + geo_facet +
                ", multimedia=" + multimedia +
                ", short_url='" + short_url + '\'' +
                '}';
    }
}
