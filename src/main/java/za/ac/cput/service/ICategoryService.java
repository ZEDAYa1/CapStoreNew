/**
 * E-Commerce Web Application for selling T-shirts
 * ICategoryService.java
 * This class provides the interface for the Category entity
 * Author: Mthandeni Mbobo - 218223579
 * */

package za.ac.cput.service;

import za.ac.cput.domain.Category;

import java.util.List;

public interface ICategoryService extends IService<Category, Long> {

    List<Category> findByCategoryId(Long categoryId);
    List<Category> findByCategoryName(String categoryName);

    boolean delete(Long categoryId);
}