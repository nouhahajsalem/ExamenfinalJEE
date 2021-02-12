package org.sid.authService.repository;


import org.sid.authService.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
