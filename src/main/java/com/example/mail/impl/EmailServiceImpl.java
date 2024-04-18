package com.example.mail.impl;

import ch.qos.logback.classic.Logger;
import com.example.mail.services.EmailService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.io.File;

@Service

public class EmailServiceImpl implements EmailService {
    private JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }


    @Override
    public void sendEmail(String to, String subject, String message) {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        simpleMailMessage.setFrom("abc@gmail.com");
        mailSender.send(simpleMailMessage);


    }

    @Override
    public void sendEmail(String[] to, String subject, String message) {


    }

    @Override
    public void sendEmailWithHtml(String to, String subject, String htmlContent) {

    }

    @Override
    public void sendEmailWithFile(String to, String subject, File file) {

    }
}
