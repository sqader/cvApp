package com.example.cvapp.repository;

import com.example.cvapp.model.EduModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduRepository extends JpaRepository<EduModel, Long> {
}
