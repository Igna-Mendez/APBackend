
package com.ignaciobiodreportfolio.portfolio.exceptions;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message){
        super(message);
    }
}
