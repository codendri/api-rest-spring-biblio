package com.example.techbiblio.domain.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PageableDto {

    @NotEmpty
    int pageNo;
    int itemsByPage;

    @NotEmpty
    String sortDir;
    @NotEmpty
    String sortField="id";


    int pageSize;
}
