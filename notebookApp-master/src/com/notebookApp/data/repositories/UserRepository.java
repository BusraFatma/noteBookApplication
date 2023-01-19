package com.notebookApp.data.repositories;

import com.notebookApp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
