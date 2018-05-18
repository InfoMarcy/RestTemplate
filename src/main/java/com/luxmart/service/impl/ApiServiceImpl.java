package com.luxmart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.luxmart.model.User;
import com.luxmart.model.UserData;
import com.luxmart.service.ApiService;

@Service("apiService")
public class ApiServiceImpl implements ApiService{

	// connect to the rest template
	private RestTemplate restTemplate;
	// get the api_url from applications property
    private final String api_url;


	public ApiServiceImpl(RestTemplate restTemplate, @Value("${api.url}") String api_url ) {
		this.restTemplate = restTemplate;
		this.api_url = api_url;
		
	}



   // return a limit number of users
	@Override
	public List<User> getUsers(Integer limit) {
		
		// gets the url and build the query string
		UriComponentsBuilder uriBuilder = UriComponentsBuilder
			.fromUriString(api_url).queryParam("limit", limit);
		
	// uriBuilder.toUriString() => makes it a uri string			
	UserData userData = restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
		return userData.getData();
	}
}
