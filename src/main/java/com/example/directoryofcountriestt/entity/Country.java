package com.example.directoryofcountriestt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

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
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean euBlack;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean euGray;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean fatfBlack;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean fatfGray;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean oecdBlack;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean oecdGray;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean kmu1045;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean kmu143;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean terrorism;
    private int corruption;
    private int haven;
    private double global;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean doubleTax;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean thirdCountries;
    private double moneyLaundering;
    private double terrorismIndex;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean sectoral;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean dangerous;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean president;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean processed;
    @Column(columnDefinition="tinyint(1) default 1")
    private boolean cyrillicNamed;
    @OneToOne
    @Cascade({CascadeType.PERSIST, CascadeType.REMOVE})
    private CountryInfo countryInfo;
}
