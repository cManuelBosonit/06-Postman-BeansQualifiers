package com.example.beansQualifiers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@Data @AllArgsConstructor @NoArgsConstructor
public class Persona {

    String name;

    @Override
    public String toString(){
        return name;
    }
}