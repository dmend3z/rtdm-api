package com.randtech.danielrt.product;

import com.randtech.danielrt.category.*;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.randtech.danielrt.utils.entities.AbstractEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The Product Entity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class ProductEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private String imgUrl;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "product_category",
        joinColumns = {@JoinColumn(name = "product_id")},
        inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private Set<CategoryEntity> categories = new HashSet<>();

}
