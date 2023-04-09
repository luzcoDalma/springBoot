package com.myapplication.novenoproyecto_dto.service;

import com.myapplication.novenoproyecto_dto.dto.InstrumentDTO;
import com.myapplication.novenoproyecto_dto.model.Instrument;
import com.myapplication.novenoproyecto_dto.model.Student;

import java.util.List;

public interface IMusicWorkshopService {

    /**
     * Este método agrega 1
     * @param student estudiante
     * @return cadena ok/failure
     */
    public String addStudent(Student student);

    /**
     * Este método agrega 1
     * @param instrument instrumento
     * @return cadena ok/failure
     */
    public String addInstrument(Instrument instrument);

    /**
     * Este método solo devuelve completa la
     * @return lista de instrumentos
     */
    public List<Instrument> showInstruments();

    /**
     * Este método solo devuelve completa la
     * @return lista de estudiantes
     */
    public List<Student> showStudents();

    /**
     * Este método devuelve información
     * de 1 instrumento
     * @param name del instrumento
     * @return instrumento
     */
    public Instrument findInstrument(String name);

    /**
     * Este método devuelve la lista entrecruzada
     * de alumnos con sus respectivos instrumentos
     *
     * @param name_instrument nombre del instrumento
     * @return lista de instrumentos por alumnos
     */
    public List<InstrumentDTO> showInstrumentsDTO(String name_instrument);
}
