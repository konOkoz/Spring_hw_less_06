package de.ait.homework.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Products {
    private String name;
    private int amount;
    private boolean expired;
}
