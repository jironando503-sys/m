package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.PeminjamanEntity;
import com.example.demo.Repository.PeminjamanRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PeminjamanService {

    private final PeminjamanRepository peminjamanRepository;
    
    public List<PeminjamanEntity> getAll() {
        return peminjamanRepository.findAll();
    }

    public Optional<PeminjamanEntity> getById(Long id) {
        return peminjamanRepository.findById(id);
    }

    public PeminjamanEntity save(PeminjamanEntity detailPeminjaman) {
        return peminjamanRepository.save(detailPeminjaman);
    }

}
