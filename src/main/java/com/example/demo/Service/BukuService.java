package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.BukuEntity;
import com.example.demo.Repository.BukuRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BukuService {
    
    private final BukuRepository bukuRepository;
    
    public List<BukuEntity> getAll() {
        return bukuRepository.findAll();
    }

    public Optional<BukuEntity> getById(Long id) {
        return bukuRepository.findById(id);
    }

    public BukuEntity save(BukuEntity buku) {
        return bukuRepository.save(buku);
    }

    public BukuEntity update(Long id, BukuEntity bukuBaru){
        BukuEntity buku = bukuRepository.findById(id).get();

        buku.setJudul(bukuBaru.getJudul());
        buku.setPenulis(bukuBaru.getPenulis());
        buku.setStok(bukuBaru.getStok());

        return bukuRepository.save(buku);
    }

    public void delete(Long id) {
        bukuRepository.deleteById(id);
    }
}
