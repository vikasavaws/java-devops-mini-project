package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Java DevOps Mini Project is running!";
    }

    @GetMapping("/api/tasks")
    public List<Map<String, Object>> getTasks() {
        return List.of(
            Map.of(
                "id", 1,
                "title", "Learn Docker",
                "status", "COMPLETED"
            ),
            Map.of(
                "id", 2,
                "title", "Learn Kubernetes",
                "status", "IN_PROGRESS"
            )
        );
    }
}
