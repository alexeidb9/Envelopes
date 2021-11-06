package com.envelopes.services.map;

import com.envelopes.model.Envelope;
import com.envelopes.services.EnvelopeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class EnvelopeMapService extends AbstractMapService<Envelope, Long> implements EnvelopeService {

    @Override
    public Set<Envelope> findAll() {
        return super.findAll();
    }

    @Override
    public Envelope findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Envelope object) {
        super.delete(object);

    }

    @Override
    public Envelope save(Envelope envelope) {

        if (envelope.getCategory() == null || envelope.getBalance() == null || envelope.getCategory().getId() == null) {
            throw new RuntimeException("Invalid envelope");
        }

        return super.save(envelope);

    }


    @Override
    public Envelope findByTitle(String title) {
        return null;
    }
}
