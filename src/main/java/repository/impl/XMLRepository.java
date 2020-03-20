package repository.impl;

import org.springframework.stereotype.Repository;

import repository.IRepository;
@Repository("xmlRepository")

public class XMLRepository  implements IRepository{
	public void save(String message) {
		System.out.println("<message>"+message+"</message>");
	}
}
