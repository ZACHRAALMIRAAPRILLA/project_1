package com.domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.Model.entities.Proyek;
import com.domain.Services.ProyekService;

@RestController
@RequestMapping("/proyek")
public class ProyekController {

    @Autowired
    private ProyekService proyekService;

    @GetMapping
    public List<Proyek> getAllProyek() {
        return proyekService.getAllProyek();
    }

    @GetMapping("/{id}")
    public Proyek getProyekById(@PathVariable Long id) {
        return proyekService.getProyekById(id);
    }

    @PostMapping
    public Proyek createProyek(@RequestBody Proyek proyek) {
        return proyekService.saveProyek(proyek);
    }

    @PutMapping("/{id}")
    public Proyek updateProyek(@PathVariable Long id, @RequestBody Proyek proyek) {
        proyek.setId(id);
        return proyekService.saveProyek(proyek);
    }

    @DeleteMapping("/{id}")
    public void deleteProyek(@PathVariable Long id) {
        proyekService.deleteProyek(id);
    }
}
