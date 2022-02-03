package com.upgrad.movieapp;

import com.upgrad.movieapp.Services.MovieService;
import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.dao.MovieDAO;
import com.upgrad.movieapp.entity.Customer;
import com.upgrad.movieapp.entity.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {

	ApplicationContext context =SpringApplication.run(MovieappApplication.class, args);

//		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);

//		Customer customer = new Customer();
//		customer.setFirstName("Kafil");
//		customer.setLastName("Patel");
//		customer.setUserName("Kafip456");
//		customer.setPassword("********");
//		customer.setDateOfBirth(LocalDateTime.of(1988,11,6,8,0));
//
//		System.out.println("Before saving:"+ customer);
//		Customer savedCustomer = customerDAO.save(customer);
//
//		System.out.println("After saving:"+ customer);
//
//        Customer retrievedCustomer = customerDAO.findById(savedCustomer.getCustomerId());
//		System.out.println("Retrieved customer:"+ retrievedCustomer);
//
//		customer.setUserName("Zulkifl");
//		Customer updateCustomer = customerDAO.update(customer);
//		System.out.println("update customer:"+ updateCustomer);
//
//		customerDAO.delete(updateCustomer);
//		System.out.println("After Deleting:"+ customerDAO.findById(updateCustomer.getCustomerId()));


//		MovieDAO movieDAO = context.getBean(MovieDAO.class);
//		System.out.println(movieDAO);
//
//		Movie movie = new Movie();
//
//		movie.setMovieName("Venom");
//		movie.setMovieDescription("Let there be Carnage");
//		movie.setReleaseDate(LocalDateTime.of(2021,11,27,2,30));
//		movie.setDuration(151);
//		movie.setCoverPhotoUrl("Cover photo Url");
//		movie.setTrailerUrl("Trailer url");
//
//		System.out.println("Before saving :"+movie);
//
//		Movie savedMovie = movieDAO.save(movie);
//		System.out.println("After saving:"+ savedMovie);
//
//		Movie retrievedMovie = movieDAO.findById(savedMovie.getMovieId()).orElse(null);
//		System.out.println("After retrieving:"+retrievedMovie);
//
//		movie.setDuration(160);
//
//		Movie movieUpdated = movieDAO.save(movie);
//		System.out.println("Updated movies:"+ movieUpdated);
//
//		movieDAO.delete(movieUpdated);
//		System.out.println("After deleting:"+ movieDAO.findById(savedMovie.getMovieId()).orElse(null));


		/**
		 * Testing movie Service
		 *
		 */

		MovieService movieService =  context.getBean(MovieService.class);

		System.out.println( "Movie Service Bean :"+ movieService);

		Movie movie = new Movie();
		movie.setMovieName("what is this");
		movie.setMovieDescription("its known by whom");
		movie.setReleaseDate(LocalDateTime.of(2025,12,22,3,30));
		movie.setDuration(120);
		movie.setTrailerUrl("trailer Url ");
		movie.setCoverPhotoUrl(" Photo Url ");

		Movie savedMovie =  movieService.acceptMovieDetails(movie);
		System.out.println(savedMovie);

		Movie searchedMovie = movieService.getMovieDetails(savedMovie.getMovieId());
		System.out.println("Search movie:"+ searchedMovie);

	}

}
