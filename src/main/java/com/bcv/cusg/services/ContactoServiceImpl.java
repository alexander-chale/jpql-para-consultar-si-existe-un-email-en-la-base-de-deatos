package com.bcv.cusg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcv.cusg.entities.Contacto;
import com.bcv.cusg.repositories.BaseRepository;
import com.bcv.cusg.repositories.ContactoRepository;

@Service
public class ContactoServiceImpl extends BaseServiceImpl<Contacto, Long> implements ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public ContactoServiceImpl(BaseRepository<Contacto, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public String getEmailContacto(String email) {

        return contactoRepository.getEmailContacto(email);

    }

}