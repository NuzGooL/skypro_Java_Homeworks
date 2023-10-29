package groupCartMeta.artifactCartMeta.packagenameMeta.controller;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;
import groupCartMeta.artifactCartMeta.packagenameMeta.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/store")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(path = "/hello")
    public String hello() {
        return storeService.hello();
    }

    @GetMapping()
    public Map<Product, Integer> showStore() {
        return storeService.showStore();
    }

    //title has no meaning. in collision title from store entity remains.
    @GetMapping(path = "/add")
    public Product add(@RequestParam("vc") int vc, @RequestParam("title") String title) {
        return storeService.add(vc, title);
    }

    @GetMapping(path = "/addDefaultPackage")
    public String addDefaultPackage() {
        storeService.addDefaultPackage();
        return "В склад добавлен дефолтный набор товаров";
    }

    @GetMapping(path = "/order/addfromSpace")
    public Product addtoCart(@RequestParam("vc") int vc, @RequestParam("title") String title) {
        return storeService.addtoCart(vc, title);
    }

    @GetMapping(path = "/order/get")
    public Map<Product, Integer> showCart() {
        return storeService.showCart();
    }

    @GetMapping(path = "/order/add")
    public Product addfromStore(@RequestParam("vc") int vc) {
        return storeService.addfromStore(vc);
    }

    @GetMapping(path = "/order/sell")
    public Map<Product, Integer> sell() {
        return storeService.sell();
    }
}