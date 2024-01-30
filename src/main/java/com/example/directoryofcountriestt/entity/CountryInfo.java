package com.example.directoryofcountriestt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "country_info")
public class CountryInfo {
    @Id
    private Integer ccn3;
    private String official;
    private String common;
    @Column(columnDefinition = "LONGTEXT")
    private String nativeName;
    private String currencies;
    private String cca2;
    private String cca3;
    private boolean independent;
    private String status;
    private boolean unMember;
    private String region;
    private String subRegion;
    private boolean landLocked;
    private int area;
    private String flag;
    private int population;
    private String startOfWeek;
    private String googleMaps;
    private String openStreetMaps;
    private String flagPng;
    private String flagSvg;
    @Column(columnDefinition = "LONGTEXT")
    private String flagAlt;
    private String format;
    private String regex;
    private String coaPng;
    private String coaSvg;
    private String iddRoot;
    @Column(columnDefinition = "LONGTEXT")
    private String iddSuffixes;
    private String languages;
    @Column(columnDefinition = "LONGTEXT")
    private String translations;
    private String tld;
    private String capital;
    private String altSpellings;
    private String latlng;
    private String borders;
    private String timezones;
    private String continents;
}
