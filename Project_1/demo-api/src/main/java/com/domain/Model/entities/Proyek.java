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
@Table(name = "Proyek")
public class Proyek {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_proyek",nullable = false)
    private String namaProyek;

    @Column(name = "client")
    private String client;

    @Column(name = "tgl_mulai")
    private java.sql.Date tglMulai;

    @Column(name = "tgl_selesai")
    private java.sql.Date tglSelesai;

    @Column(name = "pimpinan_proyek")
    private String pimpinanProyek;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "created_at",updatable = false,insertable = false,columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private java.sql.Timestamp createAt;

    @OneToMany(mappedBy = "proyek")
    private Set<Proyek_Lokasi> proyekLokasi;

    public Proyek(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public java.sql.Date getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(java.sql.Date tglMulai) {
        this.tglMulai = tglMulai;
    }

    public java.sql.Date getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(java.sql.Date tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinanProyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinanProyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public java.sql.Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(java.sql.Timestamp createAt) {
        this.createAt = createAt;
    }

    public Set<Proyek_Lokasi> getProyekLokasi() {
        return proyekLokasi;
    }

    public void setProyekLokasi(Set<Proyek_Lokasi> proyekLokasi) {
        this.proyekLokasi = proyekLokasi;
    }

    
}


// -- Tabel Proyek
// CREATE TABLE Proyek (
//     id INT AUTO_INCREMENT PRIMARY KEY,
//     nama_proyek VARCHAR(255),
//     client VARCHAR(255),
//     tgl_mulai DATE,
//     tgl_selesai DATE,
//     pimpinan_proyek VARCHAR(255),
//     keterangan TEXT,
//     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
// );