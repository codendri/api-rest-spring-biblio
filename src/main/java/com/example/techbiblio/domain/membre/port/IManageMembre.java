package com.example.techbiblio.domain.membre.port;

import com.example.techbiblio.domain.membre.entity.Membre;
import com.example.techbiblio.domain.entity.PageableDto;
import org.springframework.data.domain.Page;

public interface IManageMembre {

   public Page<Membre> findPaginated(
            PageableDto pageableDto
    );

   Long count();

  public Membre save(Membre membre);

}
