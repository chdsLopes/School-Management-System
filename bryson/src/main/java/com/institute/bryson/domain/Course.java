package com.institute.bryson.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Course {
    @Id
    private String id;
    private String name;
    private String room;

}
