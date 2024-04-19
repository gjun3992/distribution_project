package com.example.sbb;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.example.sbb.test_1.Test_1Entity;
import com.example.sbb.test_1.Test_1Repository;


@SpringBootTest
@Commit
class Test_1 {

    @Autowired
    private Test_1Repository test_1Repository;

    @Test
    void testJpa() {        
        Test_1Entity q1 = new Test_1Entity();
        q1.setF_name("김");
        q1.setL_name("홍도");
        this.test_1Repository.save(q1);  // 첫번째 질문 저장
        
        Test_1Entity q2 = new Test_1Entity();
        q2.setF_name("홍");
        q2.setL_name("길동");
        this.test_1Repository.save(q2);  // 두번째 질문 저장
    }
}