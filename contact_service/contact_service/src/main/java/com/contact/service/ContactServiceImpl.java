package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService {
    List<Contact> list = List.of(new Contact(1L, "abc@gmail.com", "ABC", 1L),
            new Contact(2L,"xyz@yahoo.in","XYZ",1L),
            new Contact(3L,"rahul@yahoo.in","Rahul",1L),
            new Contact(4L,"2usra@yahoo.in","dusra",2L),
            new Contact(5L,"third1@yahoo.in","teesra",2L),
            new Contact(6L,"last@yahoo.in","last",3L)
            );

    @Override
    public List<Contact> getContact(Long userId) {
        List<Contact>  contacts = list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
        return contacts;
    }
}
