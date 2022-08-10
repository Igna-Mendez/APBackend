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
    private String titleExp;
    private int dateExp;
    private int endExp;
    private String descExp;
    private String imgExp;

    public Exp() {
    }


    public Exp(Long idExp, String titleExp, int dateExp,int endExp, String descExp, String imgExp){ 
    this.idExp = idExp;
    this.titleExp = titleExp;
    this.dateExp = dateExp;  
    this.endExp = endExp;
    this.descExp = descExp; 
    this.imgExp = imgExp;
}
      
}