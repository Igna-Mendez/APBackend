
package com.ignaciobiodreportfolio.portfolio.repository;

import com.ignaciobiodreportfolio.portfolio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long>{
    
}
