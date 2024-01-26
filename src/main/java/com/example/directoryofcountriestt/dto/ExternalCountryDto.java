package com.example.directoryofcountriestt.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalCountryDto {
    @JsonProperty("codecountr")
    private Long code;
    @JsonProperty("namecountr")
    private String shortName;
    @JsonProperty("namecountrfull")
    private String fullName;
    @JsonProperty("namecountrlat")
    private String latinName;
    @JsonProperty("namealt")
    private String altName;
    @JsonProperty("alpha2countr")
    private String alphaTwo;
    @JsonProperty("alpha3countr")
    private String alphaThree;
    @JsonProperty("flagcountr")
    private String flag;
    @JsonProperty("eublack")
    private boolean euBlack;
    @JsonProperty("eugray")
    private boolean euGray;
    @JsonProperty("fatfblack")
    private boolean fatfBlack;
    @JsonProperty("fatfgray")
    private boolean fatfGray;
    @JsonProperty("oecdblack")
    private boolean oecdBlack;
    @JsonProperty("oecdgray")
    private boolean oecdGray;
    private boolean kmu1045;
    private boolean kmu143;
    private boolean terrorism;
    private int corruption;
    private int haven;
    private double global;
    @JsonProperty("doubletax")
    private boolean doubleTax;
    @JsonProperty("thirdcountries")
    private boolean thirdCountries;
    @JsonProperty("moneylaundering")
    private double moneyLaundering;
    @JsonProperty("terrorismindex")
    private double terrorismIndex;
    private boolean sectoral;
    private boolean dangerous;
    private boolean president;
    private boolean processed;
    @JsonProperty("cyrillicnamed")
    private boolean cyrillicNamed;
    @JsonProperty("countryInfo")
    private ExternalCountryInfoDto countryInfo;
}