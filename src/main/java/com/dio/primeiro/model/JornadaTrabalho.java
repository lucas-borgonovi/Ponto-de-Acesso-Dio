package com.dio.primeiro.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTrabalho {
//    A generatedValue serve para determinar a estrategia que o
//    banco fará para lidar com os IDs(incremental,sequence,etc...)

    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}
