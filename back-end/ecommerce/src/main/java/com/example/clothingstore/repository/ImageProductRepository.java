package com.example.clothingstore.repository;

import com.example.clothingstore.model.ImageProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageProductRepository extends JpaRepository<ImageProductEntity, Long> {
    List<ImageProductEntity> getAllByProductEntityId(Long productId);
}
