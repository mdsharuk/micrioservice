package com.example.micrioservice.fastmicrioservise.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deparment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deparmentId;
    private String deparmentName;
    private String deparmentAddress;
    private String deparmentCode;
}
