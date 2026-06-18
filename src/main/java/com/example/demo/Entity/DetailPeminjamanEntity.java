package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DetailPeminjamanEntity {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Integer jumlah;

    @ManyToOne
    @JoinColumn(name="peminjaman_Id")
    private PeminjamanEntity peminjaman;
    
    @ManyToOne
    @JoinColumn(name="buku_id")
    private BukuEntity buku;

    //hello
}
