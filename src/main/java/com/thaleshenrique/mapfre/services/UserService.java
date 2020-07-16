package com.thaleshenrique.mapfre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.thaleshenrique.mapfre.domain.User;
import com.thaleshenrique.mapfre.dto.UserDTO;
import com.thaleshenrique.mapfre.dto.UserNewDTO;
import com.thaleshenrique.mapfre.exceptions.ObjectNotFoundException;
import com.thaleshenrique.mapfre.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public User find(Integer id) 
	{
		User obj = repo.find(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Nome: " + User.class.getName());
		}
		
		return obj;
	}
	
	public User insert(User obj) 
	{
		obj.setId(null);
		return repo.save(obj);
	}

	public User update(User obj) 
	{
		find(obj.getId());
		return repo.save(obj);
	}
	
	public void delete(Integer id)
	{
		find(id);
		repo.deleteById(id);
	}
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public Page<User> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}
	
	public User fromDTO(UserNewDTO objDto)
	{
		return new User(null, objDto.getName(), objDto.getEmail(), objDto.getPassword());
	}
	
	public User fromDTO(UserDTO objDto) {
		User obj = new User(objDto.getId(), objDto.getName(), objDto.getEmail(), objDto.getPassword());
		
		return obj;
	}
}
