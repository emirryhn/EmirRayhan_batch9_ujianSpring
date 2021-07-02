package com.example.ujianspringbootweek4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ujianspringbootweek4.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value="SELECT user_id, user_name, email, instagram, company_id "
			+ "FROM users WHERE company_id = ?1", nativeQuery = true)
	public List<User> findUserByCompanyid(int Company_id);
	
	@Query(value= "select * from users where user_name=?1", nativeQuery = true)
	public List<User> findByName(String user_name);
	
}
