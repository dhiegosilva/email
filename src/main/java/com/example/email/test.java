package com.example.email;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(1)
@Service
public class test implements CommandLineRunner {
//    @Autowired
//    private JavaMailSender javaMailSender;
//
//    void sendEmail() {
//
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo("dhiego.silva@hotmail.com");
//
//        msg.setSubject("Testing from Spring Boot");
//        msg.setText("Hello World \n Spring Boot Email");
//
//        javaMailSender.send(msg);
//    }

    @Override
    public void run(String... args) throws Exception {
        for(int i=0; i<5;i++){
            System.out.println("order1 "+i);
            Thread.sleep(1000);
        }

    }
}
