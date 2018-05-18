package com.luxmart.service;

import java.util.List;

import com.luxmart.model.User;

public interface ApiService {
// get a list of users objects
	List<User> getUsers(Integer limit);
}
