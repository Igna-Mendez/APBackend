package com.ignaciobiodreportfolio.portfolio.services;

import com.ignaciobiodreportfolio.portfolio.models.Edu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ignaciobiodreportfolio.portfolio.repository.EduRepo;

@Service
@Transactional
public class EduService {

    private final EduRepo educationRepo;

    @Autowired
    public EduService(EduRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Edu addEdu(Edu edu) {
        return educationRepo.save(edu);
    }

    public List<Edu> findEdu() {
        return educationRepo.findAll();
    }

    public Edu editEdu(Edu edu) {
        return educationRepo.save(edu);
    }

    public void deleteEdu(Long id) {
        educationRepo.deleteById(id);

    }
}
