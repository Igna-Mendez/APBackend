
package com.ignaciobiodreportfolio.portfolio.services;

import com.ignaciobiodreportfolio.portfolio.models.Exp;
import com.ignaciobiodreportfolio.portfolio.repository.ExpRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExpService {
    private final ExpRepo expRepo;
            
    @Autowired
    public ExpService(ExpRepo expRepo){
    this.expRepo = expRepo;
    }
    public Exp addExp(Exp exp){
        
        return expRepo.save(exp);
    }
    
    public List<Exp> findExp(){
    return expRepo.findAll();
    }
    public Exp editExp(Exp exp){
    return expRepo.save(exp);
    }       
    
    public void deleteExp(Long id){
    expRepo.deleteById(id);
    }
    
    
    }
