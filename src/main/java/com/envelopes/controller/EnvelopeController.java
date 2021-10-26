package com.envelopes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RequestMapping("/envelope")
@RestController
public class EnvelopeController {


    @RequestMapping("/index")
    public String envelopes(@RequestParam(name = "name", required = false,
            defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "envelopes";
    }

////    @Autowired
////    private EnvelopeService envelopeService;
//    @GetMapping("/")
//    public String viewHomePage(Model model) {
//        return findPaginated(1, "firstName", "asc", model);
//    }


////	@GetMapping("/showEnvelopeForm")
////	public String showEnvelopeForm(Model model) {
////		// create model attribute to bind form data
////		Employee employee = new Employee();
////		model.addAttribute("employee", employee);
////		return "new_envelope";
////	}




    ////	@GetMapping("/page/{pageNo}")
////	public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
////			@RequestParam("sortField") String sortField,
////			@RequestParam("sortDir") String sortDir,
////			Model model) {
////		int pageSize = 5;
//
////		Page<Envelope> page = envelopeService.findPaginated(pageNo, pageSize, sortField, sortDir);
////		List<Envelope> listEnvelopes = page.getContent();
////
////		model.addAttribute("currentPage", pageNo);
////		model.addAttribute("totalPages", page.getTotalPages());
////		model.addAttribute("totalItems", page.getTotalElements());
////
////		model.addAttribute("sortField", sortField);
////		model.addAttribute("sortDir", sortDir);
////		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
////
////		model.addAttribute("listEmployees", listEnvelopes);
////		return "index";
////	}


//
////    @GetMapping
////    public Iterable findAll () {
////        return envelopeService.findAll();
////    }
//
////    @GetMapping
////    public List findByName (String name) {
////        return envelopeService.findByName(name);
////    }
//
//
//

////
////	@PostMapping("/saveEmployee")
////	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
////		// save employee to database
////		employeeService.saveEmployee(employee);
////		return "redirect:/";
////	}
////
////	@GetMapping("/showFormForUpdate/{id}")
////	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
////
////		// get employee from the service
////		Employee employee = employeeService.getEmployeeById(id);
////
////		// set employee as a model attribute to pre-populate the form
////		model.addAttribute("employee", employee);
////		return "update_employee";
////	}
////
////	@GetMapping("/deleteEmployee/{id}")
////	public String deleteEmployee(@PathVariable (value = "id") long id) {
////
////		// call delete employee method
////		this.employeeService.deleteEmployeeById(id);
////		return "redirect:/";
////	}
////
////

//
}
