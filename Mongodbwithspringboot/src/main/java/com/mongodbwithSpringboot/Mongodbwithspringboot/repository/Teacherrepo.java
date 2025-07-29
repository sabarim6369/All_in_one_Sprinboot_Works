package com.mongodbwithSpringboot.Mongodbwithspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongodbwithSpringboot.Mongodbwithspringboot.modal.Teachermodal;
public interface Teacherrepo extends MongoRepository<Teachermodal,String> {

}
