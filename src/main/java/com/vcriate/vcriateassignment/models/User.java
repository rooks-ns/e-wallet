package com.vcriate.vcriateassignment.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String name;
    @Nonnull
    private String email;
    @Nonnull
    private long phoneNumber;

}
