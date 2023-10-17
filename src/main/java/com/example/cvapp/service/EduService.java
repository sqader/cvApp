package com.example.cvapp.service;

import com.example.cvapp.model.EduModel;
import com.example.cvapp.repository.EduRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduService {
private final EduRepository eduRepository;

    public EduService(EduRepository eduRepository) {
        this.eduRepository = eduRepository;
    }
    public void addEdu(EduModel edu) {
        eduRepository.save(edu);
    }

    public List<EduModel> getAllEducation() {
        return eduRepository.findAll();
    }
}
