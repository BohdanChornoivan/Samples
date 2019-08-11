package com.spring.test.test.controller;


import com.spring.test.test.entity.TestEntity;
import com.spring.test.test.repositories.TestEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloWorldController {

    private final TestEntityRepository testEntityRepository;


    @Autowired
    public HelloWorldController(TestEntityRepository testEntityRepository) {
        this.testEntityRepository = testEntityRepository;
    }

    @GetMapping("/hello")
    public HelloWorldMessage hello() {
        return new HelloWorldMessage();
    }


    //@RequestBody

    @PostMapping(value = "/save")
    public List<TestEntity> saveEntity(@RequestBody TestEntity entity) {
        testEntityRepository.save(entity);
        return testEntityRepository.findAll();
    }

    class HelloWorldMessage {
        public final String hello = "Hello World!";
    }
}


