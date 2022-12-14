package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repodetails extends JpaRepository<Mydata, Integer>
{
	Mydata findById(int id); 

}
