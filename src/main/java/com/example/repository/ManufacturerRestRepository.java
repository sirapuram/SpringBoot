package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.model.Manufacturer;

@RepositoryRestResource(path="/datarest")
public interface ManufacturerRestRepository extends MongoRepository<Manufacturer, Integer> {

}
