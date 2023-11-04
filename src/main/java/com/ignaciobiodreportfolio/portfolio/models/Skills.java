
package com.ignaciobiodreportfolio.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private int progress;
    private String name;
   public Skills(){}
   
   public Skills(Long idSkill, int progress, String name){
        this.idSkill = idSkill;
        this.progress = progress;
        this.name = name;
      
   }
}
