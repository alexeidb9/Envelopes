package com.envelopes.controller;

import com.envelopes.exceptions.EnvelopeNotFoundException;
import com.envelopes.model.Envelope;
import com.envelopes.repositories.EnvelopeRepository;
import com.envelopes.services.EnvelopeService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@Controller
@ResponseBody
public class EnvelopeController {

    private EnvelopeService envelopeService;
    private EnvelopeRepository repository;

    public EnvelopeController() {
    }

    public EnvelopeController(EnvelopeRepository repository) {
        this.repository = repository;
    }

    public EnvelopeController(EnvelopeService envelopeService) {
        this.envelopeService = envelopeService;
    }

    @RequestMapping("/envelopes/all")
    public String listEnvelopes (Model model) {
        model.addAttribute("envelope", envelopeService.findAll());
        return "/envelopes";
    }

    @RequestMapping("/intro")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("intro");
        return modelAndView;
    }

    @GetMapping("/envelopes")
    CollectionModel<EntityModel<Envelope>> all() {

        List<EntityModel<Envelope>> envelopes = repository.findAll().stream()
                .map(envelope -> EntityModel.of(envelope,
                        linkTo(methodOn(EnvelopeController.class).one(envelope.getId())).withSelfRel(),
                        linkTo(methodOn(EnvelopeController.class).all()).withRel("envelopes")))
                .collect(Collectors.toList());

        return CollectionModel.of(envelopes, linkTo(methodOn(EnvelopeController.class).all()).withSelfRel());
    }
    // end::get-aggregate-root[]

    // tag::get-single-item[]
    @GetMapping("/employees/{id}")
    EntityModel<Envelope> one(@PathVariable Long id) {

        Envelope envelope = repository.findById(id) //
                .orElseThrow(() -> new EnvelopeNotFoundException(id));

        return EntityModel.of(envelope, //
                linkTo(methodOn(EnvelopeController.class).one(id)).withSelfRel(),
                linkTo(methodOn(EnvelopeController.class).all()).withRel("envelopes"));
    }

    @RequestMapping("/index")
    public String envelopes(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }


//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//        return findPaginated(1, "firstName", "asc", model);
//    }


//    @GetMapping("/page/{pageNo}")
//    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
//                                @RequestParam("sortField") String sortField,
//                                @RequestParam("sortDir") String sortDir,
//                                Model model) {
//        int pageSize = 5;
//
//        Page<Envelope> page = envelopeService.findPaginated(pageNo, pageSize, sortField, sortDir);
//        List<Envelope> listEnvelopes = page.getContent();
//
//        model.addAttribute("currentPage", pageNo);
//        model.addAttribute("totalPages", page.getTotalPages());
//        model.addAttribute("totalItems", page.getTotalElements());
//
//        model.addAttribute("sortField", sortField);
//        model.addAttribute("sortDir", sortDir);
//        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
//
//        model.addAttribute("listEmployees", listEnvelopes);
//        return "index";
//    }



//    @PostMapping("/saveEnvelope")
//    public String saveEmployee(@ModelAttribute("employee") Envelope envelope) {
//        // save employee to database
//        envelopeService.saveEnvelope(envelope);
//        return "redirect:/";
//    }

//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
//
//        // get employee from the service
//        Envelope envelope = envelopeService.getEnvelopeById(id);
//
//        // set employee as a model attribute to pre-populate the form
//        model.addAttribute("envelope", envelope);
//        return "update_envelope";
//    }

//    @GetMapping("/deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable(value = "id") long id) {
//
//        // call delete employee method
//        this.envelopeService.deleteEnvelopeById(id);
//        return "redirect:/";
//    }

    @GetMapping("/showEnvelopeForm")
    public String showEnvelopeForm(Model model) {
        // create model attribute to bind form data
        Envelope envelope = new Envelope();
        model.addAttribute("envelope", envelope);
        return "new_envelope";
    }


}
