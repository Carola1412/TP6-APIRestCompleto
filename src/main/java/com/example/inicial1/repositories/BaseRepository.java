package com.example.inicial1.repositories;

import com.example.inicial1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import java.io.Serializable;
import java.util.List;

@NoRepositoryBean //no crea instancias de este
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {


}
