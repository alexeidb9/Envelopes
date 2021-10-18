package com.envelopes.repository;

import com.envelopes.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnvelopeRepository extends JpaRepository<Envelope, Long>{

}
