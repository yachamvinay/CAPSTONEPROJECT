package com.qa_management.service;

import com.qa_management.model.User;
import com.qa_management.model.UserRole;

import java.util.*;
public interface UserService {
    public User crateUser(User user, Set<UserRole> userRole) throws Exception;

    public User crateAdmin(User user, Set<UserRole> userRole) throws Exception;

    public User getUser(String username);
}
