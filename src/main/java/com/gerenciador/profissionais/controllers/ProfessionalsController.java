package com.gerenciador.profissionais.controllers;


import com.gerenciador.profissionais.controllers.docs.ProfessionalsControllerDocs;
import com.gerenciador.profissionais.dtos.ProfessionalsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("profissionais")
public class ProfessionalsController implements ProfessionalsControllerDocs {

    @GetMapping
    public ResponseEntity<List<ProfessionalsDTO>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessionalsDTO> findBy(Integer id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<String> create(ProfessionalsDTO contact) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(Integer id, ProfessionalsDTO contact) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}
