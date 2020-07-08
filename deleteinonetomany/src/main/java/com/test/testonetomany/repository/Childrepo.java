package com.test.testonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.testonetomany.models.Child;

public interface Childrepo extends JpaRepository<Child,Integer>{

}
