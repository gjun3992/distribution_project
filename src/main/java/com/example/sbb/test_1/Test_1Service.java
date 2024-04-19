package com.example.sbb.test_1;


import java.util.List;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.example.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class Test_1Service {
	
    private final Test_1Repository test1Repository;

    public List<Test_1Entity> getList() {
        return this.test1Repository.findAll();
    }
    public Test_1Entity getTest(Integer id) {  
        Optional<Test_1Entity> test1 = this.test1Repository.findById(id);
        if (test1.isPresent()) {
            return test1.get();
        } else {
            throw new DataNotFoundException("Test not found");
        }
    }
}