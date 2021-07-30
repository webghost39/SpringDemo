package com.demo.spring.crud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.spring.crud.model.UserEntity;
import com.demo.spring.crud.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
	private final UserRepository userRepository;

	public List<UserEntity> getAllUser()
	{
		return userRepository.findAll();
	}
}
