package com.ark.security.service;

import com.ark.security.models.EmailDetails;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmailDetailsService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromEmail;

    public void sendMail(String recipient, String link) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom(fromEmail, "Arkadian");
        helper.setTo(recipient);
        helper.setSubject("Đặt lại mật khẩu");
        helper.setText("Đường link dưới đây dùng để đặt lại mật khẩu\n" + link);
        mailSender.send(message);
    }

    public void sendOrderInformationEmail(String recipient, String template) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        helper.setFrom(fromEmail, "Filtro Coffee");
        helper.setTo(recipient);
        helper.setSubject("Thông tin đơn hàng");
        message.setContent(template, "text/html;charset=UTF-8");
        message.saveChanges();
        mailSender.send(message);
    }


}
