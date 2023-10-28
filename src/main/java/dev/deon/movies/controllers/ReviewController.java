package dev.deon.movies.controllers;

import dev.deon.movies.services.ReviewService;
import dev.deon.movies.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/review")
@CrossOrigin(origins = "${env.FRONTEND_URL}")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }
}
