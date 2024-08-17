package com.domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Model.entities.ProyekLokasiId;
import com.domain.Model.entities.Proyek_Lokasi;
import com.domain.Services.ProyekLokasiService;

@RestController
@RequestMapping("/proyek_lokasi")
public class ProyekLokasiController {

    @Autowired
    private ProyekLokasiService proyekLokasiService;

    @GetMapping
    public List<Proyek_Lokasi> getAllProyekLokasi() {
        return proyekLokasiService.GetAllProyekLokasi();
    }

    @GetMapping("/{proyekId}/{lokasiId}")
    public Proyek_Lokasi getProyekLokasiById(@PathVariable Long proyekId, @PathVariable Long lokasiId) {
        ProyekLokasiId id = new ProyekLokasiId(proyekId, lokasiId);
        return proyekLokasiService.getProyekLokasiByID(id);
    }

    @PostMapping
    public Proyek_Lokasi createProyekLokasi(@RequestBody Proyek_Lokasi proyekLokasi) {
        return proyekLokasiService.saveProyekLokasi(proyekLokasi);
    }

    @DeleteMapping("/{proyekId}/{lokasiId}")
    public void deleteProyekLokasi(@PathVariable Long proyekId, @PathVariable Long lokasiId) {
        ProyekLokasiId id = new ProyekLokasiId(proyekId, lokasiId);
        proyekLokasiService.deleteProyekLokasi(id);
    }
}
