package com.portfolio.backend.web;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;

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
	
	
	public Review createReview(Review review) {
		return reviewRepository.save(review);
		}
	
	public Review updateReview(Long id, Review updatedReview) {
		Optional<Review> existingReview = reviewRepository.findById(id);
		
		if (existingReview.isPresent()) {
			Review review = existingReview.get();
			review.setComment(updatedReview.getComment());
			review.setRating(updatedReview.getRating());
			review.setReviewerName(updatedReview.getReviewerName());
			review.setDate(updatedReview.getDate());
			return reviewRepository.save(review);
		}
		else {
			throw new RuntimeException("Arvostelua ei lötytynyt ID:llä: " + id);
		}
		
	}
	
	public void deleteReview(Long id) {
		reviewRepository.deleteById(id);
	}
	
}
