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

import com.example.demo.Entity.DetailPeminjamanEntity;
import com.example.demo.Service.DetailPeminjamanService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/detail")
public class DetailPeminjamanController {
    
    private final DetailPeminjamanService detailPeminjamanService;

    @GetMapping
    public List<DetailPeminjamanEntity> getAll() {
        return detailPeminjamanService.getAll();
    }

    @GetMapping("/{id}") 
    public DetailPeminjamanEntity getbyId(@PathVariable Long id) {
        return detailPeminjamanService.getById(id).get();
    }

    @PostMapping
    public DetailPeminjamanEntity save(@RequestBody DetailPeminjamanEntity detail) {
        return detailPeminjamanService.save(detail);
    }

    @PutMapping("/{id}")
    public DetailPeminjamanEntity update(@PathVariable Long id, @RequestBody DetailPeminjamanEntity detail) {
        return detailPeminjamanService.update(id, detail);
    }

    @DeleteMapping("/{id}") 
    public String delete(@PathVariable Long id) {
        detailPeminjamanService.delete(id);
        return "data berhasil dihapus";
    }

}
