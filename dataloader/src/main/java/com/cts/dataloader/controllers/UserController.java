package com.cts.dataloader.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dataloader.dtos.ResponseDTO;
import com.cts.dataloader.dtos.UserDTO;
import com.cts.dataloader.dtos.UserLoginDTO;
import com.cts.dataloader.entitities.UserEntity;
import com.cts.dataloader.exception.DataLoaderException;
import com.cts.dataloader.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	//@PostMapping("/signup")
	@RequestMapping(method = RequestMethod.POST,value = "/signup")
	public ResponseDTO registerUser(@RequestBody UserDTO userDTO) {
		System.out.println("inside signup controller "+userDTO.toString());

		ResponseDTO responseDto = new ResponseDTO();

		try {
			UserEntity userEntity2 = userService.registerUserService(userDTO);
			responseDto.setResult(userEntity2);
			responseDto.setMessage("User Registered Successfully...");
		} catch (DataLoaderException e) {
			responseDto.setException(e.getMessage());
		}

		return responseDto;

	}

	@PostMapping("/login")//deserialization
	public ResponseDTO loginAuthor(@Valid @RequestBody UserLoginDTO userDTO) {
		System.out.println("inside login controller "+userDTO.toString());
		ResponseDTO responseDto = new ResponseDTO();

		try {
			UserEntity userEntity2 = userService.userLogin(userDTO);
			responseDto.setResult(userEntity2);
			responseDto.setMessage("User Login successfully");
		} catch (DataLoaderException e) {
			responseDto.setException(e.getMessage());
		}

		return responseDto;//serialization
	}
}
