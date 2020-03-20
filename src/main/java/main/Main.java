package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import config.MyBeanConfig;
import repository.IRepository;
import service.MessageService;
@Component(value="main")

public class Main {
	@Autowired
	private Main main;
	@Autowired
	IRepository txtRepository;
	@Autowired
	IRepository xmlRepository;
	@Autowired
	MessageService messageService;
	public static void main(String[] args) {
		
		BeanFactory ctx = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		Main main = (Main) ctx.getBean("main");
		main.annotationConfig();
		main.saveMessage("Gladan sam!!!");
		
	}

	private void annotationConfig() {
		txtRepository.save("My plain message!");
		
		xmlRepository.save("My xml message!");
	}
	
	private void saveMessage(String message) {
		messageService.save(message);
	}
}
