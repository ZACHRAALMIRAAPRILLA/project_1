package com.domain.Model.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProyekLokasiId implements Serializable {
    private Long proyek_id;
    private Long lokasi_id;

    public ProyekLokasiId(){}

    public ProyekLokasiId(Long proyek_id , Long lokasi_id){
        this.proyek_id = proyek_id;
        this.lokasi_id = lokasi_id;
    }

    public Long getProyek_id() {
        return proyek_id;
    }

    public void setProyek_id(Long proyek_id) {
        this.proyek_id = proyek_id;
    }

    public Long getLokasi_id() {
        return lokasi_id;
    }

    public void setLokasi_id(Long lokasi_id) {
        this.lokasi_id = lokasi_id;
    }
    
    // Equals and Hascode 

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProyekLokasiId that = (ProyekLokasiId) o;

        if (proyek_id != null ? !proyek_id.equals(that.proyek_id) : that.proyek_id != null) return false;
        return lokasi_id != null ? lokasi_id.equals(that.lokasi_id) : that.lokasi_id == null;
    }

    @Override
    public int hashCode() {
        int result = proyek_id != null ? proyek_id.hashCode() : 0;
        result = 31 * result + (lokasi_id != null ? lokasi_id.hashCode() : 0);
        return result;
    }

    
}