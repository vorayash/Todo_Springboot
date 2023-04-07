package com.in28minutes.springboot.toDoApp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

  public boolean authenticate(String username, String password) {

    boolean isValidUserName = username.equalsIgnoreCase("root");
    boolean isValidPassword = password.equalsIgnoreCase("2292001vorayash");

    return isValidUserName && isValidPassword;
  }
}
