package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PeminjamanEntity;
import com.example.demo.Service.PeminjamanService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/peminjaman")
public class PeminjamanController {
    
    private final PeminjamanService peminjamanService;

    @GetMapping
    public List<PeminjamanEntity> getAll() {
        return peminjamanService.getAll();
    }

    @GetMapping("/{id}") 
    public PeminjamanEntity getbyId(@PathVariable Long id) {
        return peminjamanService.getById(id).get();
    }

    @PostMapping
    public PeminjamanEntity save(@RequestBody PeminjamanEntity peminjaman) {
        return peminjamanService.save(peminjaman);
    }

}
