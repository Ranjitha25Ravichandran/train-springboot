package com.rest.train.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {

    @Id
    private Integer ticketId;
    private String passengerName;
    private String sourceStation;
    private String destStation;
    private String email;

}
