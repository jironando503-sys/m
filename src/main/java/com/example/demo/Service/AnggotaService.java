package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.AnggotaEntity;
import com.example.demo.Repository.AnggotaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnggotaService {
    private final AnggotaRepository anggotaRepository;
    
    public List<AnggotaEntity> getAll() {
        return anggotaRepository.findAll();
    }

    public Optional<AnggotaEntity> getById(Long id) {
        return anggotaRepository.findById(id);
    }

    public AnggotaEntity save(AnggotaEntity anggota) {
        return anggotaRepository.save(anggota);
    }

    public AnggotaEntity update(Long id, AnggotaEntity anggotaBaru){
        AnggotaEntity anggota = anggotaRepository.findById(id).get();

        anggota.setNama(anggotaBaru.getNama());
        
        return anggotaRepository.save(anggota);
    }

    public void delete(Long id) {
        anggotaRepository.deleteById(id);
    }
}
