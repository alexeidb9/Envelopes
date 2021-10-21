package com.envelopes;

//import com.envelopes.model.PersonalCategory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class EnvelopesAndPenniesWebApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EnvelopesAndPenniesWebApplication.class, args);



    }
}





