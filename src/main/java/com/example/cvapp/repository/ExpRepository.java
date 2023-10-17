package com.example.cvapp.repository;

import com.example.cvapp.model.ExpModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ExpRepository extends JpaRepository<ExpModel, Long> {
}
