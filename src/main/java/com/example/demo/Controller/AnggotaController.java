package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AnggotaEntity;
import com.example.demo.Service.AnggotaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/anggota")
public class AnggotaController {

     private final AnggotaService anggotaService;

    @GetMapping
    public List<AnggotaEntity> getAll() {
        return anggotaService.getAll();
    }

    @GetMapping("/{id}") 
    public AnggotaEntity getbyId(@PathVariable Long id) {
        return anggotaService.getById(id).get();
    }

    @PostMapping
    public AnggotaEntity save(@RequestBody AnggotaEntity anggota) {
        return anggotaService.save(anggota);
    }

    @PutMapping("/{id}")
    public AnggotaEntity update(@PathVariable Long id, @RequestBody AnggotaEntity anggota) {
        return anggotaService.update(id, anggota);
    }

    @DeleteMapping("/{id}") 
    public String delete(@PathVariable Long id) {
        anggotaService.delete(id);
        return "data berhasil dihapus";
    }

}
