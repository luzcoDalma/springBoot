package com.myapplication.novenoproyecto_dto.repository;

import com.myapplication.novenoproyecto_dto.dto.InstrumentDTO;
import com.myapplication.novenoproyecto_dto.model.Instrument;
import com.myapplication.novenoproyecto_dto.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MusicWorkshopRepository {

    List<Student> students = new ArrayList();
    List<Instrument> instruments = new ArrayList();
    List<InstrumentDTO> instrumentDTOList = new ArrayList();

    public boolean addStudent(Student student){
    try {
            students.add(student);
            return true;
        } catch (Exception e) {
            //throw new RuntimeException(e);
            return false;
        }
    }

    public boolean addInstrument(Instrument instrument){
        instruments.add(instrument);
        return true;
    }

    public List<Instrument> getInstruments(){
        return instruments;
    }

    public List<Student> getStudents(){
        return students;
    }

    public Instrument findInstrument(String name){
        //Instrument instrument;
        for(Instrument instrument : instruments){
            if(instrument.getName().equals(name)) return instrument;
        }
        return null;
    }

    public Optional<List<InstrumentDTO>> getStudentInstrument() {
        for(Instrument instrument : instruments){
            for(Student student : students) {
                if (student.getId()==instrument.getId()) {
                    InstrumentDTO iDTO = new InstrumentDTO();
                    iDTO.setId_instrument(instrument.getId());
                    iDTO.setName_instrument(instrument.getName());
                    iDTO.setType(instrument.getType());
                    iDTO.setMaterial(instrument.getMaterial());
                    iDTO.setName_student(student.getName());
                    iDTO.setLastname(student.getLastname());
                    iDTO.setCurse(student.getCurse());
                    instrumentDTOList.add(iDTO);

                }
            }
        }
        return Optional.ofNullable(instrumentDTOList);
    }
}
