package com.domain.Model.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lokasi")
public class Lokasi {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_lokasi")
    private String namaLokasi;

    @Column(name = "negara")
    private String negara;

    @Column(name = "kota")
    private String kota;

    @Column(name = "created_at",updatable = false,insertable = false,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Timestamp createdAt;

    // Relationship
    @OneToMany(mappedBy = "lokasi")
    private Set<Proyek_Lokasi> proyekLokasi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public java.sql.Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Set<Proyek_Lokasi> getProyekLokasi() {
        return proyekLokasi;
    }

    public void setProyekLokasi(Set<Proyek_Lokasi> proyekLokasi) {
        this.proyekLokasi = proyekLokasi;
    } 
}
// -- Tabel Lokasi
// CREATE TABLE Lokasi (
//     id INT AUTO_INCREMENT PRIMARY KEY,
//     nama_lokasi VARCHAR(255),
//     negara VARCHAR(255),
//     provinsi VARCHAR(255),
//     kota VARCHAR(255),
//     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
// );