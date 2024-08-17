package com.domain.Model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.Model.entities.Lokasi;

public interface LokasiRepo extends JpaRepository<Lokasi , Long> {
    
}
