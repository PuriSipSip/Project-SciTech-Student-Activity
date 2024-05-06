package com.sp343.projecta;

import com.sp343.projecta.model.Activity;
import com.sp343.projecta.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProjectaApplication {
    @Autowired
    ActivityRepository activityRepository;
    public static void main(String[] args) {SpringApplication.run(ProjectaApplication.class, args);
    }


}
