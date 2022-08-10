
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
    private String tituloEdu;
    private int fechaEdu;
    private int fechaFinEdu;
    private String descEdu;
    private String imgEdu;

    public Edu() {
    }

    
    public Edu(Long idEdu, String tituloEdu, int fechaEdu, int fechaFinEdu, String imgEdu){ 
    this.idEdu = idEdu;
    this.tituloEdu = tituloEdu;
    this.fechaEdu = fechaEdu;   
    this.descEdu = descEdu; 
    this.imgEdu = imgEdu;
}
}
