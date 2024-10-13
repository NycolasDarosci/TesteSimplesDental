package com.gerenciador.profissionais.controllers.docs;

import com.gerenciador.profissionais.dtos.ProfessionalsDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "professionals-controller", description = "<b>Recurso que gerencia os profissionais</b>")
public interface ProfessionalsControllerDocs extends BaseController<ProfessionalsDTO>{

    @Operation(summary = "Permite listar todos os profissionais")
    ResponseEntity<List<ProfessionalsDTO>> findAll();

    @Operation(summary = "Permite listar um profissional")
    ResponseEntity<ProfessionalsDTO> findBy(Integer id);

    @Operation(summary = "Permite criar um profissional")
    ResponseEntity<String> create(ProfessionalsDTO contact);

    @Operation(summary = "Permite atualizar um profissional")
    ResponseEntity<String> update(Integer id, ProfessionalsDTO contact);

    @Operation(summary = "Permite deletar um profissional")
    ResponseEntity<String> delete(Integer id);
}
