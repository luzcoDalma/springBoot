package com.myapplication.novenoproyecto_dto.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class InstrumentDTO implements Serializable {

    private int id_instrument;
    private String name_instrument;
    private String type;
    private String material;

    private String name_student;
    private String lastname;
    private String curse;

}
