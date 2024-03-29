package com.ignaciobiodreportfolio.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Exp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String name;
    private int dateExp;
    private int endExp;
    private String about;
    private String img;

    public Exp() {
    }


    public Exp(Long idExp, String name, int dateExp,int endExp, String about, String img){ 
    this.idExp = idExp;
    this.name = name;
    this.dateExp = dateExp;  
    this.endExp = endExp;
    this.about = about; 
    this.img = img;
}
      
}