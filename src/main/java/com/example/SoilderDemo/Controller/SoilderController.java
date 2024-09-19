package com.example.SoilderDemo.Controller;


import com.example.SoilderDemo.Entity.Soilder;
import com.example.SoilderDemo.Service.SoilderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/soilder")
public class SoilderController {
    private final SoilderService soilderService;

    public SoilderController(SoilderService soilderService) {
        this.soilderService = soilderService;
    }

    @GetMapping("/")
    public List<Soilder> getAllSoilders() {
        return soilderService.getAllSoilders();
    }

    @GetMapping("/{id}")
    public Soilder getSoilderById(@PathVariable Long id) {
        return soilderService.getSoilderById(id);
    }

    @PostMapping("/")
    public Soilder createSoilder(@RequestBody Soilder soilder) {
        return soilderService.saveSoilder(soilder);
    }

    @DeleteMapping("/{id}")
    public void deleteSoilder(@PathVariable Long id) {
        soilderService.deleteSoilder(id);
    }

    @GetMapping("/search")
    public List<Soilder> findSoildersByAgeAndRank(@RequestParam int minAge, @RequestParam String rank) {
        return soilderService.findSoildersByAgeAndRank(minAge, rank);
    }
}

