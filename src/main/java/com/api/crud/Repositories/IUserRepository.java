package com.api.crud.Repositories;

import com.api.crud.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //permite hacer querys de la base de datos
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}
