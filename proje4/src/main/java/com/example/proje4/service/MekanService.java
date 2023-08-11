package com.example.proje4.service;

import com.example.proje4.entity.Mekan;
import com.example.proje4.repository.MekanRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MekanService {
    @Autowired
    MekanRepository mekanRepository;


    public List<Mekan> findAllMekan() {
        return (List<Mekan>) mekanRepository.findAll();
    }

    public Mekan findMekanbyId(int id) {
        Optional<Mekan> result = mekanRepository.findById(id);
        return result.orElseGet(Mekan::new);

    }

    public Mekan addMekan(Mekan mekan) {
        return mekanRepository.save(mekan);
    }

    public Mekan updateMekan(Mekan mekan) {

        return mekanRepository.save(mekan);
    }

    public void deletebyId(int id) {
        mekanRepository.deleteById(id);
    }

    public void deleteAll() {
        mekanRepository.deleteAll();
    }
}