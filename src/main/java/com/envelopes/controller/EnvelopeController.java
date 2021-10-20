package com.envelopes.controller;

import com.envelopes.model.Envelope;
import com.envelopes.service.EnvelopeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/envelope")
class EnvelopeController {


    @Autowired
    private EnvelopeService envelopeService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPaginated(1, "firstName", "asc", model);
    }

    @GetMapping
    public Iterable findAll () {
        return envelopeService.findAll();
    }

    @GetMapping
    public List findByName (String name) {
        return envelopeService.findByName(name);
    }



	// display list of employees

//
//	@GetMapping("/showNewEmployeeForm")
//	public String showNewEmployeeForm(Model model) {
//		// create model attribute to bind form data
//		Employee employee = new Employee();
//		model.addAttribute("employee", employee);
//		return "new_employee";
//	}
//
//	@PostMapping("/saveEmployee")
//	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
//		// save employee to database
//		employeeService.saveEmployee(employee);
//		return "redirect:/";
//	}
//
//	@GetMapping("/showFormForUpdate/{id}")
//	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
//
//		// get employee from the service
//		Employee employee = employeeService.getEmployeeById(id);
//
//		// set employee as a model attribute to pre-populate the form
//		model.addAttribute("employee", employee);
//		return "update_employee";
//	}
//
//	@GetMapping("/deleteEmployee/{id}")
//	public String deleteEmployee(@PathVariable (value = "id") long id) {
//
//		// call delete employee method
//		this.employeeService.deleteEmployeeById(id);
//		return "redirect:/";
//	}
//
//
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

}
