package com.test.testonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.testonetomany.models.Parent;

public interface Parentrepo extends JpaRepository<Parent,Integer> {

}
