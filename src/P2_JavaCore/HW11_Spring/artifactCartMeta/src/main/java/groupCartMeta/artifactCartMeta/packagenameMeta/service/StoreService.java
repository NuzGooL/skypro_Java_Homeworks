package groupCartMeta.artifactCartMeta.packagenameMeta.service;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;

import java.util.List;
import java.util.Map;

public interface StoreService {
    String hello();

    Map<Product, Integer> showStore();

    Product add(int vc, String title);

    void addDefaultPackage();

    Product addtoCart(int vc, String title);

    Map<Product, Integer> showCart();

    Product addfromStore(int vc);

    Map<Product, Integer> sell();

    List<String> addList(List<Integer> vcs);
}