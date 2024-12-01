package com.portfolio.backend.domain;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String comment;
	private int rating;
	private String reviewerName;
	private LocalDateTime date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public Review(Long id, String comment, int rating, String reviewerName, LocalDateTime date) {
		super();
		this.id = id;
		this.comment = comment;
		this.rating = rating;
		this.reviewerName = reviewerName;
		this.date = date;
	}
	
	
	public Review(String comment, int rating, String reviewerName) {
		super();
		this.comment = comment;
		this.rating = rating;
		this.reviewerName = reviewerName;
	}
	
	public Review() {
		super();
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", comment=" + comment + ", rating=" + rating + ", reviewerName=" + reviewerName
				+ ", date=" + date + "]";
	}
	
	
	
}
