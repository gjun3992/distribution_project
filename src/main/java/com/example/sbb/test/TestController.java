package com.example.sbb.test;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {
    
    private final TestService testService;
  
    @GetMapping("/TestList")
    public String list(Model model) {
        List<Test> testList = this.testService.getList();
        model.addAttribute("testList", testList);
        return "Test_list"; 
    }


}