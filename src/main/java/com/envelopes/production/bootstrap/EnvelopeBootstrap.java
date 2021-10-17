package com.envelopes.production.bootstrap;

import com.envelopes.production.domain.Envelope;
import com.envelopes.production.domain.UnitOfMeasure;
import com.envelopes.production.repositories.CategoryRepository;
import com.envelopes.production.repositories.EnvelopeRepository;
import com.envelopes.production.repositories.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EnvelopeBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final EnvelopeRepository envelopeRepository;



    public EnvelopeBootstrap(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository, EnvelopeRepository envelopeRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.envelopeRepository = envelopeRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        envelopeRepository.saveAll(getEnvelopes());
    }

    private List <Envelope> getEnvelopes() {

        List<Envelope> envelopes = new ArrayList<>(2);

        //get UoM
        Optional<UnitOfMeasure> usdUomOptional = unitOfMeasureRepository.findByDescription("USD");

        if(!usdUomOptional.isPresent()) {
            throw new RuntimeException("Expected UoM Not Found.");
        }

        Optional<UnitOfMeasure> plnUomOptional = unitOfMeasureRepository.findByDescription("PLN");

        if(!plnUomOptional.isPresent()) {
            throw new RuntimeException("Expected UoM Not Found.");
        }

        Optional<UnitOfMeasure> euroUomOptional = unitOfMeasureRepository.findByDescription("EURO");

        if(!euroUomOptional.isPresent()) {
            throw new RuntimeException("Expected UoM Not Found.");
        }


        return getEnvelopes();
    }


}
