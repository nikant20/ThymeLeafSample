package com.test.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.model.TestModel;

@Repository
public interface TestRepository extends PagingAndSortingRepository<TestModel, Integer>{
}
