package com.example.cvapp.service;

import com.example.cvapp.model.ExpModel;
import com.example.cvapp.repository.ExpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpService {

    private final ExpRepository expRepository;

    public ExpService(ExpRepository expRepository) {
        this.expRepository = expRepository;
    }

    public List<ExpModel> getAllExperience() {
        return expRepository.findAll();
    }

    public void addExp(ExpModel exp) {
        expRepository.save(exp);
    }

    public ExpModel addExperience(ExpModel expModel) {
        return expRepository.save(expModel);
    }
}
