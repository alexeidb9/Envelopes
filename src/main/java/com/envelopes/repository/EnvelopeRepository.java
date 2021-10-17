package com.envelopes.repository;

import com.envelopes.model.Envelope;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EnvelopeRepository extends CrudRepository<Envelope, Long> {

        List<Envelope> findByName (String name);

}
