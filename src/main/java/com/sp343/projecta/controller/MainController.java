package com.sp343.projecta.controller;

import com.sp343.projecta.model.Activity;
import com.sp343.projecta.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {

    @Autowired
    private ActivityRepository activityRepo;

    @GetMapping("/")
    String getAllActivities(Model model) {
        List<Activity> activities = activityRepo.findAll();
        model.addAttribute("all_activities", activities);
        return "activities";
    }

    @GetMapping("/1")
    public List <Activity > Test(){
        return activityRepo.findAll();
    }

}
