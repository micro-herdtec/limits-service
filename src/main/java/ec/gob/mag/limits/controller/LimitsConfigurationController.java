package ec.gob.mag.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.mag.limits.beans.LimitConfiguration;
import ec.gob.mag.limits.properties.Configuration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration properties;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(properties.getMaximum(),properties.getMinimum());
	} 
}
