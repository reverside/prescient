package za.co.prescient.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(unique = true)
    String magStripeNo;

    @Column(unique = true)
    String rfidTagNo;

}