package org.sid.authService.repository;


import org.sid.authService.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}

