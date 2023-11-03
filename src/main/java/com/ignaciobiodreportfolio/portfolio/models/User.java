
package com.ignaciobiodreportfolio.portfolio.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String lastName;
    private String title;
    private String about;
    private String img;
    
   @OneToMany(fetch= FetchType.LAZY, mappedBy = "idEdu")
   private List<Edu> educacionList;
   @OneToMany(fetch= FetchType.LAZY, mappedBy = "idSkill")
   private List<Skills> skillList;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
   private List<Exp> expList;
   
   public User() {}

    public User(Long id, String name, String lastName, String title, String about, String img) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.title = title;
        this.about = about;
        this.img = img;
    }
   
}
