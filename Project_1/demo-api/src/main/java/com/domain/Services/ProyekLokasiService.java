package com.domain.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Model.entities.ProyekLokasiId;
import com.domain.Model.entities.Proyek_Lokasi;
import com.domain.Model.repo.ProyekLokasiRepo;

@Service
public class ProyekLokasiService {
    @Autowired
    private ProyekLokasiRepo proyekLokasiRepo;

    public List<Proyek_Lokasi> GetAllProyekLokasi(){
        return proyekLokasiRepo.findAll();
    }

    public Proyek_Lokasi getProyekLokasiByID(ProyekLokasiId id){
        return proyekLokasiRepo.findById(id).orElse(null);
    }

    public Proyek_Lokasi saveProyekLokasi(Proyek_Lokasi proyekLokasi){
        return proyekLokasiRepo.save(proyekLokasi);
    }

    public void deleteProyekLokasi(ProyekLokasiId id){
        proyekLokasiRepo.deleteById(id);
    }
}
