package com.example.bootiful.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private final String allstateDateFormat = "MM-dd-yyyy";


    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = allstateDateFormat)
    private Date dob;
    private String title;

    /**
     * possible date formats sent on json request
     *    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
     *    @JsonFormat(pattern = "dd-MM-yyyy")
     */
}

