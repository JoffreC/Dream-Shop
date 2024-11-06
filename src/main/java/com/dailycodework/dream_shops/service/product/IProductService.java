package com.dailycodework.dream_shops.service.product;


import com.dailycodework.dream_shops.model.Product;
import com.dailycodework.dream_shops.request.AddProductRequest;
import com.dailycodework.dream_shops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById (Long id);
    void deleteProductById (Long id);
    Product updateProduct (ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts ();
    List<Product> getProductsByCategory (String category);
    List<Product> getProductsByBrand (String Brand);
    List<Product> getProductsByCategoryAndBrand (String category, String brand);
    List<Product> getProductsByName (String name);
    List<Product> getProductsByBrandAndName (String brand, String name);
    Long countProductsByBrandAndName (String brand,String name);
}
