package groupCartMeta.artifactCartMeta.packagenameMeta.repository;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;

import java.util.Map;

public interface CartInt {
    Map<Product, Integer> getCart();

    void add(Product product);

    void clear();
}