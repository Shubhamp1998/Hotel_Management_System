package com.example.hms.repository;

import com.example.hms.model.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuestRepository extends MongoRepository<Guest, Long> {
}
