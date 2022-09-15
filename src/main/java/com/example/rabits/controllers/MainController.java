package com.example.rabits.controllers;

import com.example.rabits.models.Training;
import com.example.rabits.services.TrainingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String getAddNewTraining(){
        return "add_work_out";
    }

    @PostMapping("/add")
    public String postAddNewTraining(@RequestBody(required = false)Training training){
        System.out.println(training);
        return "redirect:/";
    }
    @PostMapping("/addn")
    public String postAddNewTrainingn(String type,String tasks){
        System.out.println(type);
        return "redirect:/";
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
