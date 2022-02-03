package com.upgrad.movieapp.Controller;


import com.upgrad.movieapp.DTO.MovieDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MovieController {

    private static final Map<Integer, MovieDTO> MOVIE_DTO_MAP = new HashMap<>();


    public MovieController(){

        MovieDTO movieDTO = new MovieDTO(121 , "Spider-man","NO WAY HOME", 2020/11/12,120, "CoverPhoto","Spiderman trailer" );

        MOVIE_DTO_MAP.put(movieDTO.getMovieId(),movieDTO);
    }

    @PostMapping(value = "/Movies",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMovie(@RequestBody MovieDTO movieDTO){
        System.out.println(movieDTO);
        MOVIE_DTO_MAP.put(movieDTO.getMovieId(),movieDTO);
        return new ResponseEntity(movieDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/ideas",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity fetchAllMovies(){
        List<MovieDTO> Movies = new ArrayList<>();
        for(MovieDTO movieDTO : MOVIE_DTO_MAP.values() ){
            Movies.add(movieDTO);
        }
        return new ResponseEntity(Movies,HttpStatus.OK);
    }


    @PutMapping(value = "/Movies/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateMovies (@PathVariable(value = "id") int id,MovieDTO movieDTO ){
        MOVIE_DTO_MAP.put(id,movieDTO);
        return new ResponseEntity(movieDTO,HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/Movies/{id}")
    public ResponseEntity deleteMovie(@PathVariable(value = "id") int id){
        MOVIE_DTO_MAP.remove(id);
        return new ResponseEntity(null,HttpStatus.OK);

    }

    @GetMapping(value = "/Movies/{id}")
    public ResponseEntity fetchBasedOnMovieId ( @PathVariable(value = "id")int id) {

        return new ResponseEntity(MOVIE_DTO_MAP.get(id), HttpStatus.OK);

    }

}
