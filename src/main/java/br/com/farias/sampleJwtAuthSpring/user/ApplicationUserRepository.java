package br.com.farias.sampleJwtAuthSpring.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gyliardearaujo on 29/10/20.
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}