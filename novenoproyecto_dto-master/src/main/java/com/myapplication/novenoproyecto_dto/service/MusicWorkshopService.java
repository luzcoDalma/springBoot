package com.myapplication.novenoproyecto_dto.service;

import com.myapplication.novenoproyecto_dto.dto.InstrumentDTO;
import com.myapplication.novenoproyecto_dto.model.Instrument;
import com.myapplication.novenoproyecto_dto.model.Student;
import com.myapplication.novenoproyecto_dto.repository.MusicWorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicWorkshopService implements IMusicWorkshopService{

    @Autowired
    MusicWorkshopRepository repository;


    @Override
    public String addStudent(Student student) {
        if(repository.addStudent(student)) return "Agregado";
        else return "Error al agregar";
    }

    @Override
    public String addInstrument(Instrument instrument) {
        if(repository.addInstrument(instrument)) return "Agregado";
        else return "Error al agregar";
    }

    @Override
    public List<Instrument> showInstruments() {
        return repository.getInstruments();
    }

    @Override
    public List<Student> showStudents() {
        return repository.getStudents();
    }

    @Override
    public Instrument findInstrument(String name) {
        return repository.findInstrument(name);
    }

    @Override
    public List<InstrumentDTO> showInstrumentsDTO(String name_instrument) {
        /*List<InstrumentDTO> complete = showInstrumentsDTO(name_instrument);
        List<InstrumentDTO> aux = null;
        for(InstrumentDTO filter : complete){
            if(filter.getName_instrument()==name_instrument) aux.add(filter);
        }
        return aux;*/
        return showInstrumentsDTO(name_instrument);
    }
}
