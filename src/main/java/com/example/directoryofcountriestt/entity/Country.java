package com.example.directoryofcountriestt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "countries")
public class Country {
    @Id
    private Long countryCode;
    private String shortName;
    private String fullName;
    private String latinName;
    private String altName;
    private String alphaTwo;
    private String alphaThree;
    private String flag;
    private boolean euBlack;
    private boolean euGray;
    private boolean fatfBlack;
    private boolean fatfGray;
    private boolean oecdBlack;
    private boolean oecdGray;
    private boolean kmu1045;
    private boolean kmu143;
    private boolean terrorism;
    private int corruption;
    private int haven;
    private double global;
    private boolean doubleTax;
    private boolean thirdCountries;
    private double moneyLaundering;
    private double terrorismIndex;
    private boolean sectoral;
    private boolean dangerous;
    private boolean president;
    private boolean processed;
    private boolean cyrillicNamed;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @PrimaryKeyJoinColumn
    private CountryInfo countryInfo;
}
