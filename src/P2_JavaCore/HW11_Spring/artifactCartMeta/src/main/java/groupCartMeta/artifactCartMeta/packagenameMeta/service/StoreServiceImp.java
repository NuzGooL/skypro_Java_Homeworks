package groupCartMeta.artifactCartMeta.packagenameMeta.service;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;
import groupCartMeta.artifactCartMeta.packagenameMeta.exceptions.NoVCinStore;
import groupCartMeta.artifactCartMeta.packagenameMeta.repository.Cart;
import groupCartMeta.artifactCartMeta.packagenameMeta.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImp implements StoreService {
    @Autowired
    private StoreRepository store;
    @Autowired
    private Cart cart;

    @Override
    public String hello() {
        return "Добро пожаловать в сторатор";
    }

    @Override
    public Map<Product, Integer> showStore() {
        return Collections.unmodifiableMap(store.getRepository());
    }

    @Override
    public Product add(int vc, String title) {
        Product product = new Product(vc, title);
        store.add(product);
        return store.getRepository().keySet().stream().filter(p -> p.getVendorCode() == vc).findAny().orElse(null);
    }

    @Override
    public void addDefaultPackage() {
        store.add(new Product(1, "Item1"));
        store.add(new Product(2, "Item2"));
        store.add(new Product(3, "Item3"));
        store.add(new Product(4, "Item4"));
    }

    @Override
    public Product addtoCart(int vc, String title) {
        Product product = new Product(vc, title);
        cart.add(product);
        return cart.getCart().keySet().stream().filter(p -> p.getVendorCode() == vc).findAny().orElse(null);
    }

    @Override
    public Map<Product, Integer> showCart() {
        return Collections.unmodifiableMap(cart.getCart());
    }

    @Override
    public Product addfromStore(int vc) {
        Product product = store.getRepository().keySet().stream().filter(p -> p.getVendorCode() == vc).findAny().orElse(null);
        if (product == null) {
            throw new NoVCinStore("product with vc=" + vc + " is out of store");
        }
        store.remove(product);
        cart.add(product);
        return product;
    }

    @Override
    public Map<Product, Integer> sell() {
        Map<Product, Integer> result = Collections.unmodifiableMap(cart.getCart());
        cart.clear();
        return result;
    }

    @Override
    public List<String> addList(List<Integer> vcs) {
        List<String> showResult = new ArrayList<>();
        for (Integer vc : vcs) {
            try {
                showResult.add(addfromStore(vc).toString());
            } catch (NoVCinStore e) {
                showResult.add(e.getMessage());
            }
        }
        return showResult;
    }
}