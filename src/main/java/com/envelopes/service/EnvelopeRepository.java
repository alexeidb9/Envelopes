package com.envelopes.service;

import com.envelopes.model.Envelope;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class EnvelopeRepository implements CrudRepository<Envelope, Long> {
    @Override
    public <S extends Envelope> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Envelope> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Envelope> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Envelope> findAll() {
        return null;
    }

    @Override
    public Iterable<Envelope> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Envelope entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Envelope> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
