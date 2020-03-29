package com.hadi.hr.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String startDate;
    private String finishDate;
    private Long salary;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "CONTRACT_TYPE_ID", referencedColumnName = "ID")
    private ContractType contractType;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
    private Category category;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")
    private Employee employee;
}
