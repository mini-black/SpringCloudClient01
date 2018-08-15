package com.zhangtao.spring_cloud_client.XiaoheiSpringCloudClient01.contrller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiContrller {
	
	@Autowired
    RestTemplate restTemplate;

	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public String hi(){
		return restTemplate.getForObject("http://xioaheiClient02/hello",String.class);

	}
	
}
