package com.manektech.springDataRest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ad")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @NotNull(message = "Who is the owner of this ad?")
    public String owner;

    @NotNull(message = "Please, inform a title for your ad.")
    @Size(min = 5, max = 140, message = "Titles must have between {min} and {max} characters.")
    public String title;

    @NotNull(message = "Please, inform a description for your ad.")
    @Size(min = 5, max = 500, message = "Titles must have between {min} and {max} characters.")
    public String description;

    @Min(message = "Price cannot be negative", value = 0)
    public Double price;
}
