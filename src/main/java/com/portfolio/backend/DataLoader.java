package com.portfolio.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.portfolio.backend.domain.Review;
import com.portfolio.backend.domain.ReviewRepository;

@Component
public class DataLoader implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(DataLoader.class);
	
	private final ReviewRepository reviewRepository;
	
	public DataLoader(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*if (reviewRepository.count() == 0) {
		Review review = new Review();
		Review review1 = new Review();
		Review review2 = new Review();
		
		review.setReviewerName("Matti");
		review.setRating(5);
		review.setComment("Mahtava Peli!");
		
		review1.setReviewerName("Liisa");
		review1.setRating(3);
		review1.setComment("Huono Peli!");
		
		review2.setReviewerName("Jere");
		review2.setRating(1);
		review2.setComment("Surkea peli!");
		
		reviewRepository.save(review);
		reviewRepository.save(review1);
		reviewRepository.save(review2);
		
		logger.info("Testi tiedot lisättiin tietokantaan yhden kerran!");*/
		//}
	}

}
