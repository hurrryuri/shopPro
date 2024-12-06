package com.example.shoppro.service;


import com.example.shoppro.dto.CategoryDTO;
import com.example.shoppro.dto.CategorysoDTO;
import com.example.shoppro.entity.Category;
import com.example.shoppro.entity.Categoryso;
import com.example.shoppro.repository.CategoryRepository;
import com.example.shoppro.repository.CategorysoRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@Transactional
@RequiredArgsConstructor
public class CategorysoService {

    private final CategorysoRepository categorysoRepository;

    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;


    public void saveca(CategorysoDTO categorysoDTO){

        Category category =
        categoryRepository.findById(categorysoDTO.getCaid()).get();

        Categoryso a = modelMapper.map(categorysoDTO, Categoryso.class);

        a.setCategory(category);

        categorysoRepository.save(a);


    }
    public List<CategorysoDTO> listzz (){

        return categorysoRepository.findAll().stream().map(categoryso ->
                modelMapper.map(categoryso , CategorysoDTO.class).setCategoryDTO(modelMapper.map(categoryso.getCategory(), CategoryDTO.class))
        ).collect(Collectors.toList());

    }






}
