package com.FXF.MicroServices.limitServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FXF.MicroServices.limitServices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;

	@GetMapping("/limit")
	public LimitConfiguration getLimitConfiguration()
	{
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
	
	
}
