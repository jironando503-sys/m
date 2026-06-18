package com.example.demo.Entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class PeminjamanEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private LocalDate tanggalPinjam;

    @ManyToOne
    @JoinColumn(name="anggota_Id")
    private AnggotaEntity anggota;

    @ManyToOne
    @JoinColumn(name="buku_Id")
    private BukuEntity buku;

    @OneToMany(mappedBy = "peminjaman")
    @JsonIgnore
    private List<DetailPeminjamanEntity> detailPeminjaman;
}
