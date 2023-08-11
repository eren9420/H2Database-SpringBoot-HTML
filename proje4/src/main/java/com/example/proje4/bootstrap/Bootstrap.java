package com.example.proje4.bootstrap;

import com.example.proje4.entity.Mekan;
import com.example.proje4.repository.MekanRepository;
import org.springframework.boot.CommandLineRunner;

public class Bootstrap implements CommandLineRunner {

    MekanRepository mekanRepository;

    public Bootstrap(MekanRepository mekanRepository) {
        this.mekanRepository = mekanRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Mekan m1 = new Mekan(1,5,"a","Üsküdar","abc");

        mekanRepository.save(m1);

    }
}
