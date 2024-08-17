package com.domain.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Model.entities.Proyek;
import com.domain.Model.repo.ProyekRepo;

@Service
public class ProyekService {

    @Autowired
    private ProyekRepo ProyekRepo;

    public List<Proyek> getAllProyek() {
        return ProyekRepo.findAll();
    }

    public Proyek getProyekById(Long id) {
        return ProyekRepo.findById(id).orElse(null);
    }

    public Proyek saveProyek(Proyek proyek) {
        return ProyekRepo.save(proyek);
    }

    public void deleteProyek(Long id) {
        ProyekRepo.deleteById(id);
    }
}
