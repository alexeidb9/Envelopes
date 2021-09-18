package com.envelopes.production.controllers;

import com.envelopes.production.domain.Category;
import com.envelopes.production.domain.UnitOfMeasure;
import com.envelopes.production.repositories.CategoryRepository;
import com.envelopes.production.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("Personal");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("USD");

        System.out.println("Category ID is " + categoryOptional.get().getId());
        System.out.println("Unit of Measure ID is " + unitOfMeasureOptional.get().getId());

        return "index";}

}
