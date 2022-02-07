package com.manektech.springDataRest.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ad")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @NotNu
    public String owner;
    public String title;
    public String description;
    public Double price;
}
