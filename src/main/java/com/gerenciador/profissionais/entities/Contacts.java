package com.gerenciador.profissionais.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Table(name = "contatos")
@Getter
@Setter
@NoArgsConstructor
public class Contacts {

    @Id
    @Column(unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "nome", nullable = false)
    String name;

    @Column(name = "contato", nullable = false)
    String contact;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    LocalDateTime createdDate = LocalDateTime.now();

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "profissional", referencedColumnName = "id")
    Professionals professional;
}
