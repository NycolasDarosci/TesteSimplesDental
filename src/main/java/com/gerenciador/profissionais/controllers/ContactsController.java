package com.gerenciador.profissionais.controllers;

import com.gerenciador.profissionais.controllers.docs.ContactsControllerDocs;
import com.gerenciador.profissionais.dtos.ContactsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("contatos")
public class ContactsController implements ContactsControllerDocs {

    @GetMapping
    public ResponseEntity<List<ContactsDTO>> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactsDTO> findBy(Integer id) {
        return null;
    }

    @PostMapping
    public ResponseEntity<String> create(ContactsDTO contact) {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(Integer id, ContactsDTO contact) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(Integer id) {
        return null;
    }
}
