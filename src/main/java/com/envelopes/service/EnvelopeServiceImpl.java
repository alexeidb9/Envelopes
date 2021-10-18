package com.envelopes.service;

import java.util.List;
import java.util.Optional;

import com.envelopes.model.Envelope;
import com.envelopes.repository.EnvelopeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class EnvelopeServiceImpl {

	@Autowired
	private EnvelopeRepository envelopeRepository;

	@Override
	public List<Envelope> getAllEnvelopes() {
		return envelopeRepository.findAll();
	}

	@Override
	public void saveEnvelope(Envelope envelope) {
		this.envelopeRepository.save(envelope);
	}

	@Override
	public Envelope getEnvelopeById(long id) {
		Optional<Envelope> optional = envelopeRepository.findById(id);
		Envelope envelope = null;
		if (optional.isPresent()) {
			envelope = optional.get();
		} else {
			throw new RuntimeException(" Envelope not found for id :: " + id);
		}
		return envelope;
	}

	@Override
	public void deleteEnvelopeById(long id) {
		this.envelopeRepository.deleteById(id);
	}

	@Override
	public Page<Envelope> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.envelopeRepository.findAll(pageable);
	}
}
