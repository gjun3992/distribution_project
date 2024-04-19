package com.example.sbb.test_1;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Test_1Controller {
    
    private final Test_1Service test1Service;
  
    @GetMapping("/Test1List")
    public String list(Model model) {
    	Test_1Entity t_2 = this.test1Service.getTest(2);
    	model.addAttribute("test1List", t_2);
        return "Test1_list"; 
        
    }
//    @GetMapping("/Test1List")
//    public String list(Model model) {
//        List<Test_1Entity> test1List = this.test1Service.getList();
//        model.addAttribute("test1List", test1List);
//    
//    	return "Test1_list"; 
//    	
//    }


}
