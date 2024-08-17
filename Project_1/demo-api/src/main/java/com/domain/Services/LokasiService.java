package com.domain.Services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Model.entities.Lokasi;
import com.domain.Model.repo.LokasiRepo;

@Service
public class LokasiService {

    @Autowired
    private LokasiRepo LokasiRepo;

    public List<Lokasi> getAllLokasi() {
        return LokasiRepo.findAll();
    }

    public Lokasi getLokasiById(Long id) {
        return LokasiRepo.findById(id).orElse(null);
    }

    public Lokasi saveLokasi(Lokasi lokasi) {
        return LokasiRepo.save(lokasi);
    }

    public void deleteLokasi(Long id) {
        LokasiRepo.deleteById(id);
    }
}
