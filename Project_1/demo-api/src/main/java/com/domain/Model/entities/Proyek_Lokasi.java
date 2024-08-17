package com.domain.Model.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proyek_Lokasi")
public class Proyek_Lokasi {
    @EmbeddedId
    private ProyekLokasiId id;

    @ManyToOne
    @JoinColumn(name = "proyek_id",insertable = false,updatable = false)
    private Proyek proyek;

    @ManyToOne
    @JoinColumn(name = "lokasi_id",insertable = false,updatable = false)
    private Lokasi lokasi;

    // Constructor
    public  Proyek_Lokasi(){}

    public Proyek_Lokasi(Proyek proyek , Lokasi lokasi){
        this.proyek = proyek;
        this.lokasi = lokasi;
        this.id = new ProyekLokasiId(proyek.getId(),lokasi.getId());
    }

    public ProyekLokasiId getId() {
        return id;
    }

    public void setId(ProyekLokasiId id) {
        this.id = id;
    }

    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    
}




// -- Tabel Proyek_Lokasi (tabel penghubung)
// CREATE TABLE Proyek_Lokasi (
//     proyek_id INT,
//     lokasi_id INT,
//     FOREIGN KEY (proyek_id) REFERENCES Proyek(id),
//     FOREIGN KEY (lokasi_id) REFERENCES Lokasi(id),
//     PRIMARY KEY (proyek_id, lokasi_id)
// );

