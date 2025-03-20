package com.eventos.api.service;

import com.eventos.api.domain.address.Address;
import com.eventos.api.domain.event.Event;
import com.eventos.api.domain.event.EventRequestDTO;
import com.eventos.api.repositories.AddressRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRespository addressRespository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.uf());
        address.setEvent(event);
        return addressRespository.save(address);
    }
}


/**
 * Remote - false
 * Address -> Event
 *
 * Remote - true
 * Event
 */