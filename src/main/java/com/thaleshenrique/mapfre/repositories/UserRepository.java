package com.thaleshenrique.mapfre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thaleshenrique.mapfre.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("Select u From User u where u.id = ?1")
	User find(int id);
}
