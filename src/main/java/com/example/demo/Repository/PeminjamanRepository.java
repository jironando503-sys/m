package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.PeminjamanEntity;

public interface  PeminjamanRepository extends JpaRepository<PeminjamanEntity, Long> {
    
}
