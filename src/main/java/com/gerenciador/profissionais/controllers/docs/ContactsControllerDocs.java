package com.gerenciador.profissionais.controllers.docs;

import com.gerenciador.profissionais.dtos.ContactsDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "contacts-controller", description = "<b>Recurso que gerencia os contatos</b>")
public interface ContactsControllerDocs extends BaseController<ContactsDTO> {

    @Operation(summary = "Permite listar todos os contatos")
    ResponseEntity<List<ContactsDTO>> findAll(); // colocar os parametros depois

    @Operation(summary = "Permite listar um contato")
    ResponseEntity<ContactsDTO> findBy(Integer id);

    @Operation(summary = "Permite criar um contato")
    ResponseEntity<String> create(ContactsDTO contact);

    @Operation(summary = "Permite atualizar um contato")
    ResponseEntity<String> update(Integer id, ContactsDTO contact);

    @Operation(summary = "Permite deletar um contato")
    ResponseEntity<String> delete(Integer id);
}
