package com.example.techbiblio.application.controller;

import com.example.techbiblio.domain.membre.entity.Membre;
import com.example.techbiblio.domain.entity.PageableDto;
import com.example.techbiblio.domain.membre.port.MembreDomain;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/membres")
public class MembreRestController {

    @Autowired
    private MembreDomain membreDomain;

    @GetMapping("")
    public ResponseEntity<Page<Membre>> listeMembres   (@RequestBody @Valid PageableDto pageableDto){
        return new ResponseEntity<>(membreDomain.findPaginated(pageableDto), HttpStatus.OK);
    }

}
