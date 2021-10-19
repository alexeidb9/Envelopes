package com.envelopes.service;

import com.envelopes.model.Envelope;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EnvelopeService extends CrudRepository<Envelope, Long> {

    List<Envelope> findByName (String name);

    private List<Envelope> listAllEnvelopes () {

        return null;
    }

    List<Envelope> getAllEmployees();
    void saveEmployee(Envelope envelope);
    Envelope getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Envelope> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}
