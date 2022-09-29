package com.institute.bryson.host;

import com.institute.bryson.domain.Course;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public class CourseRegistrationEndpoint {

    @PostMapping
    public ResponseEntity<Course> registerCouse(Course course) {
        return ResponseEntity.ok().body(course);
    }
}
