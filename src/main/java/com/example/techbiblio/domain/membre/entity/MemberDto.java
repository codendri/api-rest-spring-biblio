package com.example.techbiblio.domain.membre.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberDto {

    private String nom ;
    private String email ;
    private LocalDate dateMembership = null;
    private  String statut;

}
