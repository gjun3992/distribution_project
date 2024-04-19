package com.example.sbb.test;

import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TestService {
	
    private final TestRepository testRepository;

    public List<Test> getList() {
        return this.testRepository.findAll();
    }
    public Test getTest(Integer id) {  
        Optional<Test> test = this.testRepository.findById(id);
        if (test.isPresent()) {
            return test.get();
        } else {
            throw new DataNotFoundException("Test not found");
        }
    }
}