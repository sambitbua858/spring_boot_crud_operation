package com.NIT.tokensCheck.Repository.Repoofuser;

import com.NIT.tokensCheck.Entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long > {


    Optional<User> findByEmail(String email);
}
