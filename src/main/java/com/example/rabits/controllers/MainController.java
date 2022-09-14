package com.example.rabits.controllers;

import com.example.rabits.services.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    private final TrainingService trainingService;

    public MainController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("hello","Hello");
        model.addAttribute("traininglist",trainingService.findAll());
        return "index";
    }

//    @PostMapping("/add")
//    public String addTraining(@RequestParam(required = false) String training){
//        if (training != null){
//            trainingService.save(training);
//        }
//        System.out.println(training);
//        return "redirect:/";
//    }
}
