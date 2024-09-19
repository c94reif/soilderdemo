package com.example.SoilderDemo.Service;

import com.example.SoilderDemo.Entity.Soilder;
import com.example.SoilderDemo.Repo.SoilderRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoilderService {
    private final SoilderRepo soilderRepo;

    public SoilderService(SoilderRepo soilderRepo) {
        this.soilderRepo = soilderRepo;
    }

    public Soilder saveSoilder(Soilder soilder) {
        return soilderRepo.save(soilder);
    }

    public List<Soilder> getAllSoilders() {
        return soilderRepo.findAll();
    }

    public Soilder getSoilderById(Long id) {
        return soilderRepo.findById(id).orElseThrow(() -> new RuntimeException("Soilder not found"));
    }

    public void deleteSoilder(Long id) {
        soilderRepo.deleteById(id);
    }
    public List<Soilder> findSoildersByAgeAndRank(int minAge, String rank) {
    return soilderRepo.findSoildersByAgeAndRank(minAge, rank);
    }
}
