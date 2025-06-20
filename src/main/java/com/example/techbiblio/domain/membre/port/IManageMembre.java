package com.example.techbiblio.domain.membre.port;

import com.example.techbiblio.domain.membre.entity.Membre;
import com.example.techbiblio.domain.entity.PageableDTO;
import com.example.techbiblio.domain.membre.entity.MembreDto;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IManageMembre {

   Page<Membre> findPaginated(
            PageableDTO pageable
   );

   Long count();


  Membre save(MembreDto membreDto);

  Optional<Membre> findById(Long id);

}
