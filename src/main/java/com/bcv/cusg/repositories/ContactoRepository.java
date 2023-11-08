package com.bcv.cusg.repositories;

import org.springframework.data.jpa.repository.Query;

import com.bcv.cusg.entities.Contacto;

//@Repository
public interface ContactoRepository extends BaseRepository<Contacto, Long> {

  @Query(value = "select txContacto from Contacto where txContacto = ?1")
  String getEmailContacto(String txContacto);
}
