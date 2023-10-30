package groupCartMeta.artifactCartMeta.packagenameMeta.repository;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;

import java.util.Map;

public interface StoreRepositoryInt {
    Map<Product, Integer> getRepository();

    void add(Product product);

    void merge(Map<Product, Integer> cart);

    void remove(Product product);
}
