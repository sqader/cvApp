package com.example.cvapp.controller;

import com.example.cvapp.model.EduModel;
import com.example.cvapp.service.EduService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/education")
public class EduController {


    private final EduService eduService;


    @GetMapping
    public String getAllEducation(Model model) {
        List<EduModel> eduList = eduService.getAllEducation();
        model.addAttribute("eduModel", eduList);
        return "education/education";
    }
}
