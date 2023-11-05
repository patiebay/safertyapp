package com.patricia.safetyapp.safetyapp;



import java.util.List;


import com.patricia.safetyapp.safetyapp.models.Persons;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SafetyNetController {
/*
    private final EmployeeRepository repository;

    FirestationController(EmployeeRepository repository) {
        this.repository = repository;
    }*/


    @GetMapping("/firestation/{stationNumber}")
    String peopleByStation() {
        return "hello";//repository.findAll();
    }

    @GetMapping("/childAlert/{address}")
    List<Persons> childBySddress() {
        return null;//repository.findAll();
    }

    @GetMapping("/phoneAlert/{firestation}")
    List<Persons> phoneAlertByStationId() {
        return null;//repository.findAll();
    }

    @GetMapping("/fire/{address}")
    List<Persons> peopleFromAddress() {
        return null;//repository.findAll();
    }

    @GetMapping("/flood/station/{stations}")
    List<Persons> getHouseholdsFromStations() {
        return null;//repository.findAll();
    }

    @GetMapping("/personInfo/{firstName}")
    List<Persons> getPersonInfo() {
        return null;//repository.findAll();
    }

    @GetMapping("/communityEmail/{city}")
    List<Persons> getEmailAddressesFromCity() {
        return null;//repository.findAll();
    }





    // end::get-aggregate-root[]
/*
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }*/
}
