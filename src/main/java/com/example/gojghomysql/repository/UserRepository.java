package com.example.gojghomysql.repository;

import com.example.gojghomysql.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
