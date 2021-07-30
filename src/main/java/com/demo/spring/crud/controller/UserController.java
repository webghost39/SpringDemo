package com.demo.spring.crud.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.crud.model.UserEntity;
import com.demo.spring.crud.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController
{
	private final UserService userService;

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserEntity> getAll()
	{
		return userService.getAllUser();
	}
}
