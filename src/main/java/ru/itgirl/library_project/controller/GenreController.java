package ru.itgirl.library_project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.itgirl.library_project.dto.GenreDto;
import ru.itgirl.library_project.service.GenreService;

@RestController
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/{id}")
    public GenreDto getGenre(@PathVariable Long id) {
        return genreService.getGenreById(id);
    }
}