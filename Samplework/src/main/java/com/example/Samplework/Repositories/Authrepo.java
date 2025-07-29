	package com.example.Samplework.Repositories;
	
	import org.springframework.data.mongodb.repository.MongoRepository;
	
	import com.example.Samplework.Modals.Authmodal;
	import java.util.*;
	public interface Authrepo extends MongoRepository<Authmodal,String>{
	List<Authmodal> findByAgeGreaterThan(int age);
	
	List<Authmodal> findByEmailNotEqualTo(String email);
	}
