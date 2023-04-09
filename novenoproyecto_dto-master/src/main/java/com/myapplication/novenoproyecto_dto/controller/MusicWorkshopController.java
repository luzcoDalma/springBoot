package com.myapplication.novenoproyecto_dto.controller;

import com.myapplication.novenoproyecto_dto.dto.InstrumentDTO;
import com.myapplication.novenoproyecto_dto.model.Instrument;
import com.myapplication.novenoproyecto_dto.model.Student;
import com.myapplication.novenoproyecto_dto.service.IMusicWorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicWorkshopController {

    @Autowired
    IMusicWorkshopService interMusic;

    @PostMapping("/alumnos")
    public String addStudent(@RequestBody Student student) {
        return interMusic.addStudent(student);
    }

    @PostMapping("/instrumentos")
    public String addInstrument(@RequestBody Instrument instrument) {
        return interMusic.addInstrument(instrument);
    }

    @GetMapping("/instrumentos/traer")
    @ResponseBody
    public List<Instrument> showInstruments() {
        return interMusic.showInstruments();
    }

    @GetMapping("/alumnos/traer")
    @ResponseBody
    public List<Student> showStudents() {
        return interMusic.showStudents();
    }

    @GetMapping("/instrumentos/traer/{name}")
    public Instrument showInstrument(@PathVariable String name) {
        return interMusic.findInstrument(name);
    }

    @GetMapping("/alumnos/traer/{name_instrument}")
    @ResponseBody
    public List<InstrumentDTO> showStudents(@PathVariable String name_instrument) {
        return interMusic.showInstrumentsDTO(name_instrument);
    }


}
