package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.repo.contactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class contactService {
    @Autowired
    private contactRepo contactrepo;
   public void addContact(Contact contact)
    {
        Contact newContact = new Contact();
        newContact.setContact_name(contact.getContact_name());
        newContact.setContact_type(contact.getContact_type());
        newContact.setCurrency_code(contact.getCurrency_code());
        newContact.setStatus(contact.getStatus());
        System.out.println(newContact);
        contactrepo.save(newContact);
    }
}
