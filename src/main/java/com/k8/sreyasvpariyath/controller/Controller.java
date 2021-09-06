package com.k8.sreyasvpariyath.controller;

import static com.k8.sreyasvpariyath.constants.Constants.VERSION;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.k8.sreyasvpariyath.model.User;

@RestController
@RequestMapping("/rest/vi/api")
public class Controller {


	@GetMapping
	public String info() {
		return VERSION;
	}

	@GetMapping("/user/{name}")
	@ResponseBody
	public ResponseEntity<User> getEmployeesById(@PathVariable String name) {
		return ResponseEntity.ok(new User(name));
	}

	@PostMapping("/users")
	public ResponseEntity<User> postSample(@RequestBody User test) {
		return ResponseEntity.ok(test);
	}
}
