package com.bcv.cusg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcv.cusg.entities.Contacto;
import com.bcv.cusg.services.ContactoService;
import com.bcv.cusg.services.ContactoServiceImpl;

import org.json.JSONObject;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/contacto")
public class ContactoController extends BaseControllerIdLongImpl<Contacto, ContactoServiceImpl> {

  @Autowired
  public ContactoService servicio;

  @PostMapping("/email")

  public String getEmail(@RequestBody String txContacto) {
    System.out.println(txContacto);

    // Convertimos el string en un objeto json
    JSONObject json = new JSONObject(txContacto);

    String mail = json.getString("email");
    String email = servicio.getEmailContacto(mail);

    return email;

  }

}
