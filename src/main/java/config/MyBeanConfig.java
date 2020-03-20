package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import repository.IRepository;
import repository.impl.TxtRepository;
import repository.impl.XMLRepository;
import service.MessageService;
import service.impl.MessageServiceImpl;

@ComponentScan(basePackages = "main,repository,service")
public class MyBeanConfig {
	
	
}
