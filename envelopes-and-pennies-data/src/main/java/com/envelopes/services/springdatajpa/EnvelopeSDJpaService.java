package com.envelopes.services.springdatajpa;

import com.envelopes.model.Envelope;
import com.envelopes.repositories.CategoryRepository;
import com.envelopes.repositories.EnvelopeRepository;
import com.envelopes.repositories.UserRepository;
import com.envelopes.services.EnvelopeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class EnvelopeSDJpaService implements EnvelopeService {

    private final EnvelopeRepository envelopeRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    public EnvelopeSDJpaService(EnvelopeRepository envelopeRepository,
                                CategoryRepository categoryRepository, UserRepository userRepository) {
        this.envelopeRepository = envelopeRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Envelope findByTitle(String title) {
        return envelopeRepository.findByTitle(title);
    }

    @Override
    public Set<Envelope> findAll() {
        Set<Envelope> envelopes = new HashSet<>();
        envelopeRepository.findAll().forEach(envelopes::add);
        return envelopes;
    }

    @Override
    public Envelope findById(Long aLong) {
        return envelopeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Envelope save(Envelope object) {
        return envelopeRepository.save(object);
    }

    @Override
    public void delete(Envelope object) {
        envelopeRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        envelopeRepository.deleteById(aLong);
    }

}
