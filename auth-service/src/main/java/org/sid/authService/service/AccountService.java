package org.sid.authService.service;



import java.util.List;

import org.sid.authService.entities.AppRole;
import org.sid.authService.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}

