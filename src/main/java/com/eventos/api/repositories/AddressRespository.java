package com.eventos.api.repositories;

import com.eventos.api.domain.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRespository extends JpaRepository<Address, UUID> {
}
