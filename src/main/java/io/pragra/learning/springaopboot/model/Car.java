package io.pragra.learning.springaopboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Car {
    final String make;
    String model;
    IEngine engine;

 }
