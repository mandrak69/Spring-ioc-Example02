package repository.impl;

import org.springframework.stereotype.Repository;

import repository.IRepository;
@Repository("txtRepository")
public class TxtRepository implements IRepository {
	public void save(String message) {
		System.out.println(message);
	}
}
