package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.DogPicture;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisExampleApplicationTests {

	@Autowired
	private RestTemplate restTemlate;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void getDetails() {
	
		String url = "https://random.dog/woof.json";
		DogPicture dp = restTemlate.getForObject(url, DogPicture.class);
		System.out.println(dp);
	}

}

