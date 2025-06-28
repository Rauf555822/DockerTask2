package org.example.dockertask2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Gun {
    @Id
    private String id;
    private String brand;
    private String model;
    private String caliber;
    private String manufacturer;
}
