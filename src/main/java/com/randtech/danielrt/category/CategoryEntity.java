package com.randtech.danielrt.category;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.randtech.danielrt.product.ProductEntity;
import com.randtech.danielrt.utils.entities.AbstractEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "category")
public class CategoryEntity extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private long name;

    @ManyToMany(mappedBy = "categories")
    private Set<ProductEntity> products = new HashSet<>();

}
