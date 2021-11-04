package com.envelopes.services;

import com.envelopes.model.Envelope;
import org.springframework.stereotype.Service;


@Service
public interface EnvelopeService extends CrudService<Envelope, Long> {

    Envelope findByTitle (String title);


}
