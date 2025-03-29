package com.portfolio.backend.domain;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewid;
	private Long igdbId;
	private String comment;
	private int rating;
	private String reviewerName;
	private LocalDateTime date;
	
	public Long getReviewid() {
		return reviewid;
	}
	public void setReviewid(Long reviewid) {
		this.reviewid = reviewid;
	}
	public Long getIgdbId() {
		return igdbId;
	}
	public void setIgdbId(Long igdbId) {
		this.igdbId = igdbId;
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
	public Review() {
		super();
	}
	
	public Review(Long reviewid, Long igdbId, String comment, int rating, String reviewerName, LocalDateTime date) {
		super();
		this.reviewid = reviewid;
		this.igdbId = igdbId;
		this.comment = comment;
		this.rating = rating;
		this.reviewerName = reviewerName;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", igdbId=" + igdbId + ", comment=" + comment + ", rating=" + rating
				+ ", reviewerName=" + reviewerName + ", date=" + date + "]";
	}
	
	
	
	
	
	
}
