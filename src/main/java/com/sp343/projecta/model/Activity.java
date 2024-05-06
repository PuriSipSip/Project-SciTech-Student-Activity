package com.sp343.projecta.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "Activity")
public class Activity {
   @Id
    private String id;
    private String ActivityName;
    private String ActivityDescription;
    private String Image;
    private String Location;
    private String Time;
    private String Date;
}
