package org.example.dockertask2.service;

import lombok.RequiredArgsConstructor;
import org.example.dockertask2.model.Gun;
import org.example.dockertask2.repository.GunRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GunService {
    private final GunRepository gunRepository;

    public List<Gun> getAll() {return gunRepository.findAll();}

    public Gun save(Gun gun) {return gunRepository.save(gun);}

    public Gun getById(String id) {return gunRepository.findById(id).orElse(null);}

    public void deleteById(String id) {gunRepository.deleteById(id);}
}
