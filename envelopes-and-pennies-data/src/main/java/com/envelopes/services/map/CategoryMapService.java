package com.envelopes.services.map;


import com.envelopes.model.Category;
import com.envelopes.services.CategoryService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CategoryMapService extends AbstractMapService<Category, Long> implements CategoryService {


    @Override
    public Set<Category> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Category object) {

    }

    @Override
    public Category save(Category object) {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return super.findById(id);
    }
}
