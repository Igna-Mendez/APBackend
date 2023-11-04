
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
    private Long idEdu;
    private String titleEdu;
    private int startDate;
    private int endDate;
    private String info;
    private String img;
  

    public Edu() {
    }

    
    public Edu(Long idEdu, String titleEdu, int startDate, int endDate, String img, String info){ 
    this.idEdu = idEdu;
    this.titleEdu = titleEdu;
    this.startDate = startDate;   
    this.endDate = endDate;
    this.info = info; 
    this.img = img;
    
}
}
