package groupCartMeta.artifactCartMeta.packagenameMeta.repository;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;

@Repository
@SessionScope
public class Cart implements CartInt {
    private Map<Product, Integer> cart;

    public Cart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    @Autowired
    private StoreRepository store;

    public Map<Product, Integer> getCart() {
        return cart;
    }

    @PostConstruct
    public void init() {
        System.out.println("new cart is created");
    }

    @PreDestroy
    public void predestroy() {
        store.merge(cart);
        cart = new HashMap<>();
        System.out.println("cart destroyed");
    }

    @Override
    public void add(Product product) {
        cart.merge(product, 1, Integer::sum);
    }

    @Override
    public void clear() {
        cart = new HashMap<>();
        System.out.println("cart is empty");
    }
}