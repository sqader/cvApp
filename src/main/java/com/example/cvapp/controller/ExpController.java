package com.example.cvapp.controller;

import com.example.cvapp.model.ExpModel;

import com.example.cvapp.service.ExpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/experience")
public class ExpController {


    private final ExpService expService;


    @GetMapping
    public String getAllExperience(Model model) {
        List<ExpModel> expList = expService.getAllExperience();
        model.addAttribute("expModel", expList);
        return "experience/experience";
    }

    @PostMapping("/addExperience")
    public RedirectView postAddNewTask(ExpModel exp) {
        expService.addExp(exp);
        return new RedirectView("/experience");
    }


    @PostMapping
    public ExpModel addExperience(@RequestBody ExpModel expModel) {
        return expService.addExperience(expModel);
    }
}
