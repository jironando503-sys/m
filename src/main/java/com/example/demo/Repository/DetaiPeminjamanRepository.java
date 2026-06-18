package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.DetailPeminjamanEntity;

public interface  DetaiPeminjamanRepository extends JpaRepository<DetailPeminjamanEntity, Long> {
    
}
