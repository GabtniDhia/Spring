package com.example.kaddem.repositories;

import com.example.kaddem.entities.Projet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends CrudRepository<Projet,Long> {
}
