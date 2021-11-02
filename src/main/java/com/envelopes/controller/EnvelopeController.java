package com.envelopes.controller;

import com.envelopes.model.Envelope;
import com.envelopes.service.EnvelopeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RequestMapping("/envelope")
@RestController
public class EnvelopeController {

    //	@Autowired
    private EnvelopeService envelopeService;

    public EnvelopeController() {
    }

    @RequestMapping("/index")
    public String envelopes(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }


    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPaginated(1, "firstName", "asc", model);
    }


    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<Envelope> page = envelopeService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Envelope> listEnvelopes = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listEmployees", listEnvelopes);
        return "index";
    }


//    @GetMapping
//    public Iterable findAll() {
//        return envelopeService.findAll();
//    }

    @GetMapping
    public List findByName(String name) {
        return envelopeService.findByName(name);
    }


    @PostMapping("/saveEnvelope")
    public String saveEmployee(@ModelAttribute("employee") Envelope envelope) {
        // save employee to database
        envelopeService.saveEnvelope(envelope);
        return "redirect:/";
    }

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

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {

        // call delete employee method
        this.envelopeService.deleteEnvelopeById(id);
        return "redirect:/";
    }

    @GetMapping("/showEnvelopeForm")
    public String showEnvelopeForm(Model model) {
        // create model attribute to bind form data
        Envelope envelope = new Envelope();
        model.addAttribute("envelope", envelope);
        return "new_envelope";
    }


}
