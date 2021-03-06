package gking.crow.controller;

import gking.crow.entity.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people")
@SpringBootApplication
public class PersonController {
    @GetMapping
    public String getBook(){
        Phone person = new Phone();
        person.getId();
        return "Testando!";
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonController.class, args);
    }
}
