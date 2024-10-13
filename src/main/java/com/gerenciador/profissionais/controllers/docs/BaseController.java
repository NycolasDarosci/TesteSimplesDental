package com.gerenciador.profissionais.controllers.docs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface BaseController<DTO> {

    ResponseEntity<List<DTO>> findAll();
    ResponseEntity<DTO> findBy(@PathVariable Integer id);
    ResponseEntity<String> create(@RequestBody DTO contact);
    ResponseEntity<String> update(@PathVariable Integer id, @RequestBody DTO contact);
    ResponseEntity<String> delete(@PathVariable Integer id);

}
