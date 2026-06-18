package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.DetailPeminjamanEntity;
import com.example.demo.Repository.DetaiPeminjamanRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DetailPeminjamanService {
     
    private final DetaiPeminjamanRepository detaiPeminjamanRepository;
    
    public List<DetailPeminjamanEntity> getAll() {
        return detaiPeminjamanRepository.findAll();
    }

    public Optional<DetailPeminjamanEntity> getById(Long id) {
        return detaiPeminjamanRepository.findById(id);
    }

    public DetailPeminjamanEntity save(DetailPeminjamanEntity detailPeminjaman) {
        return detaiPeminjamanRepository.save(detailPeminjaman);
    }

    public DetailPeminjamanEntity update(Long id, DetailPeminjamanEntity detailPeminjamanBaru){
        DetailPeminjamanEntity detailPeminjaman = detaiPeminjamanRepository.findById(id).get();

        detailPeminjaman.setJumlah(detailPeminjamanBaru.getJumlah());

        return detaiPeminjamanRepository.save(detailPeminjaman);
    }

    public void delete(Long id) {
        detaiPeminjamanRepository.deleteById(id);
    }
}
