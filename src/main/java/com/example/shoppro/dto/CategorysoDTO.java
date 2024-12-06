package com.example.shoppro.dto;


import com.example.shoppro.entity.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CategorysoDTO {


    private Long id;

    private Long caid;

    private String caname;

    private CategoryDTO categoryDTO;

    public CategorysoDTO setCategoryDTO(CategoryDTO categoryDTO) {
        this.categoryDTO = categoryDTO;
        return this;
    }
}
