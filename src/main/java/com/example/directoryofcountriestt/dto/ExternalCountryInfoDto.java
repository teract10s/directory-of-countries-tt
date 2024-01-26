package com.example.directoryofcountriestt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalCountryInfoDto {
    private Long ccn3;
    private String official;
    private String common;
    @JsonProperty("nativename")
    private String nativeName;
    private String currencies;
    private String cca2;
    private String cca3;
    private boolean independent;
    private String status;
    @JsonProperty("unmember")
    private boolean unMember;
    private String region;
    @JsonProperty("subregion")
    private String subRegion;
    @JsonProperty("landlocked")
    private boolean landLocked;
    private int area;
    private String flag;
    private int population;
    @JsonProperty("startofweek")
    private String startOfWeek;
    @JsonProperty("googlemaps")
    private String googleMaps;
    @JsonProperty("openstreetmaps")
    private String openStreetMaps;
    @JsonProperty("flag_png")
    private String flagPng;
    @JsonProperty("flag_svg")
    private String flagSvg;
    @JsonProperty("flag_alt")
    private String flagAlt;
    private String format;
    private String regex;
    @JsonProperty("coa_png")
    private String coaPng;
    @JsonProperty("coa_svg")
    private String coaSvg;
    @JsonProperty("idd_root")
    private String iddRoot;
    @JsonProperty("idd_suffixes")
    private String iddSuffixes;
    private String languages;
    private String translations;
    private String tld;
    private String capital;
    private String altSpellings;
    private String latlng;
    private String borders;
    private String timezones;
    private String continents;
}
