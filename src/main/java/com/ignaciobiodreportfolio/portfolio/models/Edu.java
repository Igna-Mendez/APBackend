
package com.ignaciobiodreportfolio.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Edu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloEdu;
    private int startDate;
    private int endDate;
    private String info;
    private String img;

    public Edu() {
    }

    
    public Edu(Long id, String tituloEdu, int startDate, int endDate, String img){ 
    this.id = id;
    this.tituloEdu = tituloEdu;
    this.startDate = startDate;   
    this.endDate = endDate;
    this.info = info; 
    this.img = img;
    
}
}
