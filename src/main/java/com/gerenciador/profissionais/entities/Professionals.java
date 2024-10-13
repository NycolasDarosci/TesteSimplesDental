package com.gerenciador.profissionais.entities;

import com.gerenciador.profissionais.enums.Position;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "profissionais")
@Getter
@Setter
@NoArgsConstructor
public class Professionals {

    @Id
    @Column(unique = true, nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "nome", nullable = false)
    String name;

    @Column(name = "cargo", nullable = false, length = 20)
    @Enumerated(value = EnumType.STRING)
    Position position;

    @Column(name = "nascimento", nullable = false)
    LocalDate birth;

    @CreatedDate
    @Column(name = "created_date", nullable = false, updatable = false)
    LocalDateTime createdDate = LocalDateTime.now();

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, mappedBy = "professional")
    @Fetch(FetchMode.SUBSELECT)
    List<Contacts> contacts;
}
