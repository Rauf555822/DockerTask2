package org.example.dockertask2.controller;

import lombok.RequiredArgsConstructor;
import org.example.dockertask2.model.Gun;
import org.example.dockertask2.service.GunService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gun")
public class GunController {
    private final GunService gunService;

    @GetMapping("/getAll")
    public List<Gun> getAll() {return gunService.getAll();}

    @PostMapping("/save")
    public Gun save(@RequestBody Gun gun) {return gunService.save(gun);}

    @GetMapping("/getById/{id}")
    public Gun getById(@PathVariable String id) {return gunService.getById(id);}

    @DeleteMapping("/delete")
    public void delete (@RequestParam String id) {gunService.deleteById(id);}

}
