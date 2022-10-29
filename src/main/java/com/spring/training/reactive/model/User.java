package com.spring.training.reactive.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {

    @Id
    String id;
    String firstName;
    String lastName;
    String userName;
    String password;

}
