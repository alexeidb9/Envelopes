package com.envelopes.bootstrap;

import com.envelopes.model.Category;
import com.envelopes.model.Envelope;
import com.envelopes.services.CategoryService;
import com.envelopes.services.EnvelopeService;
import com.envelopes.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final EnvelopeService envelopeService;
    private final UserService userService;
    private final CategoryService categoryService;

    public DataLoader(EnvelopeService envelopeService, UserService userService, CategoryService categoryService) {
        this.envelopeService = envelopeService;
        this.userService = userService;
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = categoryService.findAll().size();

        if (count == 0 ){
            loadData();
    }

    }

    private void loadData() {

        Category personal = new Category();
        personal.setName("Personal");
        personal.setDescription("Budget for personal needs.");
        Category savedPersonalCategory = categoryService.save(personal);

        Envelope photography = new Envelope();
        photography.setBalance(Double.valueOf(100));
        photography.setTitle("Saving for new 50mm lenses");
        photography.setCategory(personal);


//        Owner owner1 = new Owner();
//        owner1.setFirstName("Michael");
//        owner1.setLastName("Weston");
//        owner1.setAddress("123 Brickerel");
//        owner1.setCity("Miami");
//        owner1.setTelephone("1231231234");
//
//        Pet mikesPet = new Pet();
//        mikesPet.setPetType(savedDogPetType);
//        mikesPet.setOwner(owner1);
//        mikesPet.setBirthDate(LocalDate.now());
//        mikesPet.setName("Rosco");
//        owner1.getPets().add(mikesPet);
//
//        ownerService.save(owner1);
//
//        Owner owner2 = new Owner();
//        owner2.setFirstName("Fiona");
//        owner2.setLastName("Glenanne");
//        owner2.setAddress("123 Brickerel");
//        owner2.setCity("Miami");
//        owner2.setTelephone("1231231234");
//
//        Pet fionasCat = new Pet();
//        fionasCat.setName("Just Cat");
//        fionasCat.setOwner(owner2);
//        fionasCat.setBirthDate(LocalDate.now());
//        fionasCat.setPetType(savedCatPetType);
//        owner2.getPets().add(fionasCat);
//
//        ownerService.save(owner2);
//
//        Visit catVisit = new Visit();
//        catVisit.setPet(fionasCat);
//        catVisit.setDate(LocalDate.now());
//        catVisit.setDescription("Sneezy Kitty");
//
//        visitService.save(catVisit);
//
//        System.out.println("Loaded Owners....");
//
//        Vet vet1 = new Vet();
//        vet1.setFirstName("Sam");
//        vet1.setLastName("Axe");
//        vet1.getSpecialities().add(savedRadiology);
//
//        vetService.save(vet1);
//
//        Vet vet2 = new Vet();
//        vet2.setFirstName("Jessie");
//        vet2.setLastName("Porter");
//        vet2.getSpecialities().add(savedSurgery);
//
//        vetService.save(vet2);
//
//        System.out.println("Loaded Vets....");

    }


}
