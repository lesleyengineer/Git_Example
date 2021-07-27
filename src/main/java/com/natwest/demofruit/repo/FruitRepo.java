package com.natwest.demofruit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.demofruit.domain.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Long> {

}
