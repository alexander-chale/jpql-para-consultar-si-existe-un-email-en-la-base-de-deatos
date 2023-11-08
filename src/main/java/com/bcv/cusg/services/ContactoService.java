package com.bcv.cusg.services;

import com.bcv.cusg.entities.Contacto;

public interface ContactoService extends BaseService<Contacto, Long> {

    String getEmailContacto(String email);
}
