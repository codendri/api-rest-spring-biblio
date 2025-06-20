package com.example.techbiblio.domain.membre.entity;

import com.example.techbiblio.domain.entity.BaseEntity;
import jakarta.persistence.Entity;

import lombok.*;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter()
@Getter()
@Entity
public class Membre extends BaseEntity {

    String nom ;
    String email ;
    LocalDate dateMembership = null;
    String statut;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateMembership(LocalDate dateMembership) {
        this.dateMembership = dateMembership;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateMembership() {
        return dateMembership;
    }

    public String getStatut() {
        return statut;
    }



}
