package com.portfolio.backend.web;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.http.ResponseEntity;

import com.portfolio.backend.domain.Review;
import com.portfolio.backend.domain.ReviewRepository;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/reviews")
public class ReviewRestController {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@GetMapping
	public List<Review> getAllReviews() {
		return reviewRepository.findAll();
	}
	
	
	
	@GetMapping("/rating/{rating}")
	public List<Review> getReviewsByRating(@PathVariable int rating) {
		return reviewRepository.findByRating(rating);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Review> addReview(@RequestBody Review review) {
		Review savedreview = reviewRepository.save(review);
		return ResponseEntity.ok(savedreview);
		 
	}
	
	@GetMapping("/game/{igdbId}")
	public List<Review> getReviewsByGameId(@PathVariable Long igdbId) {
	    return reviewRepository.findByIgdbId(igdbId);
	}
	
	public Review updateReview(Long reviewid, Review updatedReview) {
		Optional<Review> existingReview = reviewRepository.findById(reviewid);
		
		if (existingReview.isPresent()) {
			Review review = existingReview.get();
			review.setComment(updatedReview.getComment());
			review.setRating(updatedReview.getRating());
			review.setReviewerName(updatedReview.getReviewerName());
			review.setDate(updatedReview.getDate());
			return reviewRepository.save(review);
		}
		else {
			throw new RuntimeException("Arvostelua ei lötytynyt ID:llä: " + reviewid);
		}
		
	}
	
	public void deleteReview(Long reviewid) {
		reviewRepository.deleteById(reviewid);
	}
	
}
