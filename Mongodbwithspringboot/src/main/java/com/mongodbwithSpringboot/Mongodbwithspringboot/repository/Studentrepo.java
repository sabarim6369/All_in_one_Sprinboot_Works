package com.mongodbwithSpringboot.Mongodbwithspringboot.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongodbwithSpringboot.Mongodbwithspringboot.modal.Students;
public interface Studentrepo extends MongoRepository<Students,Integer>{

}
