package entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "emp_id", nullable = false)
    private long id;
    private String name;
}