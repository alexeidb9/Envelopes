package com.envelopes.services.springdatajpa;

import com.envelopes.model.Envelope;
import com.envelopes.repositories.EnvelopeCategoryRepository;
import com.envelopes.repositories.EnvelopeRepository;
import com.envelopes.repositories.UserRepository;
import com.envelopes.services.EnvelopeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EnvelopeSDJpaService implements EnvelopeService {

    private final EnvelopeRepository envelopeRepository;
    private final EnvelopeCategoryRepository envelopeCategoryRepository;
    private final UserRepository userRepository;

    public EnvelopeSDJpaService(EnvelopeRepository envelopeRepository,
                                EnvelopeCategoryRepository envelopeCategoryRepository, UserRepository userRepository) {
        this.envelopeRepository = envelopeRepository;
        this.envelopeCategoryRepository = envelopeCategoryRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Set<Envelope> findAll() {
        return null;
    }

    @Override
    public Envelope findById(Long aLong) {
        return null;
    }

    @Override
    public Envelope save(Envelope object) {
        return null;
    }

    @Override
    public void delete(Envelope object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Envelope findByTitle(String title) {
        return null;
    }
}
