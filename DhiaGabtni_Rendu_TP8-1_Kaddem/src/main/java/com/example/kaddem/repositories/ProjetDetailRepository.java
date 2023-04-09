package com.example.kaddem.repositories;

import com.example.kaddem.entities.ProjetDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetDetailRepository extends CrudRepository<ProjetDetail,Long> {
}
