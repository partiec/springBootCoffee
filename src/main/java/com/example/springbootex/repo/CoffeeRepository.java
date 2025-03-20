package com.example.springbootex.repo;

import com.example.springbootex.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {

}
