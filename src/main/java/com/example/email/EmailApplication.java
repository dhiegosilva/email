package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailApplication {
@Autowired
JavaMailSender b;
    public static void main(String[] args) {

        SpringApplication.run(EmailApplication.class, args);

        System.out.println("maybe im last");

    }
    @EventListener(ApplicationReadyEvent.class)
    void sendEmail() {
        System.out.println("aaaaaaaaa");
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("dhiego.silva@hotmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");

        b.send(msg);
    }
}

