package com.sp343.projecta.controller;

import com.sp343.projecta.model.Activity;
import com.sp343.projecta.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MainController {

    @Autowired
    private ActivityRepository activityRepo;

    @GetMapping("/activity")
    public ModelAndView getAllActivities(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Activity> activities = activityRepo.findAll();

        // Check if activities is not null before adding it to the model
        if (activities != null) {
            model.addAttribute("all_activities", activities);
        }

        return modelAndView;
    }

}
