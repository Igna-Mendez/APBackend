
package com.ignaciobiodreportfolio.portfolio.services;

import com.ignaciobiodreportfolio.portfolio.exceptions.UserNotFoundException;
import com.ignaciobiodreportfolio.portfolio.models.User;
import com.ignaciobiodreportfolio.portfolio.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service 
@Transactional 
public class UserService {
    private final UserRepo userRepo;
    
    @Autowired
    public UserService(UserRepo userRepo){
    this.userRepo = userRepo; 
    }
     public User addUser(User user){
      return userRepo.save(user);
  }
  public List<User> showAllUsers(){
      return userRepo.findAll();
  } 
  
 public User findUser(Long id){
     return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("usuario no encontrado"));
 }
 
  public User editUser(User user){
      return userRepo.save(user); 
  }
  public void deleteUser(Long id){
      userRepo.deleteById(id);
      
  }
}
