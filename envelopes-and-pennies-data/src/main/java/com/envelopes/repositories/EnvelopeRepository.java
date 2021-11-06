package com.envelopes.repositories;

import com.envelopes.model.Envelope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnvelopeRepository extends CrudRepository<Envelope, Long> {

    Envelope findByTitle(String title);


}


