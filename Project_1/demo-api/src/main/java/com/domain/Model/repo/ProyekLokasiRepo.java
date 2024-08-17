package com.domain.Model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.domain.Model.entities.ProyekLokasiId;
import com.domain.Model.entities.Proyek_Lokasi;

public interface ProyekLokasiRepo extends JpaRepository<Proyek_Lokasi, ProyekLokasiId > {
    
}
