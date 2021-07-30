package com.demo.spring.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.spring.crud.model.UserEntity;

@Component
public interface UserRepository extends JpaRepository<UserEntity, Long>
{
	//it use name convention for the method name to auto generate sql for you
	//intellij will give you hint when you type. but check the jpa official doc
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.declared-queries
	//https://www.baeldung.com/spring-data-derived-queries
	List<UserEntity> findAll();
}
