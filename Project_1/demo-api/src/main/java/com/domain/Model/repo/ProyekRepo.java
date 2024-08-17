package com.domain.Model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domain.Model.entities.Proyek;

public interface ProyekRepo extends JpaRepository< Proyek, Long> {
    
}
