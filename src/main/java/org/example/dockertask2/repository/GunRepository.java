package org.example.dockertask2.repository;

import org.example.dockertask2.model.Gun;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GunRepository extends MongoRepository<Gun, String> {
}
