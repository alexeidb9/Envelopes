package com.envelopes.repositories;

import com.envelopes.model.Envelope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EnvelopeRepository extends CrudRepository<Envelope, Long> {

    Envelope findByTitle(String title);

    List<Envelope> findAllByNameLike(String name);

}


