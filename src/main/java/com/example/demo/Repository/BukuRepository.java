package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.BukuEntity;

@Repository
public interface BukuRepository extends JpaRepository<BukuEntity, Long> {
}