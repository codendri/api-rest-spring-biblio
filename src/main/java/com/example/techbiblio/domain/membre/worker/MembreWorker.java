package com.example.techbiblio.domain.membre.worker;

import com.example.techbiblio.domain.membre.entity.Membre;
import com.example.techbiblio.domain.entity.PageableDto;
import com.example.techbiblio.domain.membre.port.MembreDomain;
import com.example.techbiblio.infrastructure.local.db.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MembreWorker implements MembreDomain {

    @Autowired
    private MembreRepository membreRepository;


    @Override
    public Page<Membre> findPaginated(PageableDto pageableDto) {

        Sort sort = pageableDto.getSortDir().equals(Sort.Direction.ASC.name()) ? Sort.by(pageableDto.getSortField()).ascending() : Sort.by(pageableDto.getSortField()).descending();
        Pageable pageable = PageRequest.of(pageableDto.getPageNo() - 1, pageableDto.getPageSize(), sort);
        return membreRepository.findAll(pageable);

    }

    @Override
    public Long count() {
        return membreRepository.count();
    }

    @Override
    public Membre save(Membre membre) {

        HashMap<String,String> errors = new HashMap<>();
        Membre save =membre;
        Membre data = null;

        if(save.getNom().isEmpty()){
            errors.put("nom","Le champ nom est requis");
        }

        if(save.getEmail().isEmpty()){
            errors.put("email","Le champ email est requis");
        }

        if(save.getDateMembership()==null){
            errors.put("dateMembership","Le champ date d'adhésion est requis");
        }

        if(errors.isEmpty()){

            data = membreRepository.save(save);

        }

        return data;
    }
}
