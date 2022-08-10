
package com.ignaciobiodreportfolio.portfolio.services;

import com.ignaciobiodreportfolio.portfolio.models.Skills;
import com.ignaciobiodreportfolio.portfolio.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillService {
    private final SkillsRepo skillsRepo;
    
    @Autowired 
    public SkillService(SkillsRepo skillsRepo){
    this.skillsRepo = skillsRepo;
    }
    
    public Skills addSkill(Skills skill){
        return skillsRepo.save(skill);
    }
    public List<Skills> findSkill(){
        return skillsRepo.findAll();
        
    }
      public Skills editSkill(Skills skill){
          return skillsRepo.save(skill);
      }
    public void deleteSkill(Long id){
        skillsRepo.deleteById(id);
    }
  
    
}


