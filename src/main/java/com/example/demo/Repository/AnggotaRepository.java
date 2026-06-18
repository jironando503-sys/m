package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.AnggotaEntity;

public interface AnggotaRepository extends JpaRepository<AnggotaEntity, Long> {
    
}
