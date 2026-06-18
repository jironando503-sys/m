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

import com.example.demo.Entity.BukuEntity;
import com.example.demo.Service.BukuService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/buku")
public class BukuController {
    
    private final BukuService bukuService;

    @GetMapping
    public List<BukuEntity> getAll() {
        return bukuService.getAll();
    }

    @GetMapping("/{id}") 
    public BukuEntity getbyId(@PathVariable Long id) {
        return bukuService.getById(id).get();
    }

    @PostMapping
    public BukuEntity save(@RequestBody BukuEntity buku) {
        return bukuService.save(buku);
    }

    @PutMapping("/{id}")
    public BukuEntity update(@PathVariable Long id, @RequestBody BukuEntity buku) {
        return bukuService.update(id, buku);
    }

    @DeleteMapping("/{id}") 
    public String delete(@PathVariable Long id) {
        bukuService.delete(id);
        return "data berhasil dihapus";
    }

}
