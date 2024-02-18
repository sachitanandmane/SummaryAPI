package org.example.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RefNum;

    @Column
    private String l_name;

    @Column
    private String beneName;

    @CreationTimestamp
    private Date createdate;

    @Column
    private Date modidate;

    @Column
    private Double Amount;

    @Column
    private String currency;

    @Column
    private String Appname;
}
