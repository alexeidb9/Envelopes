package com.envelopes.repository;

import com.envelopes.model.Envelope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvelopeRepository extends CrudRepository<Envelope, Long> {

    @Override
    List<Envelope> findAll();

}
