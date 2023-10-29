package groupCartMeta.artifactCartMeta.packagenameMeta.repository;

import groupCartMeta.artifactCartMeta.packagenameMeta.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class StoreRepository implements StoreRepositoryInt {
    private Map<Product, Integer> repository;

    public StoreRepository(Map<Product, Integer> repository) {
        this.repository = repository;
    }

    @Override
    public Map<Product, Integer> getRepository() {
        return repository;
    }

    @Override
    public void add(Product product) {
        repository.merge(product, 1, Integer::sum);
    }

    @Override
    public void merge(Map<Product, Integer> cart) {
        repository = Stream.of(repository, cart)
                .flatMap(productIntegerMap -> productIntegerMap.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum));
    }

    @Override
    public void remove(Product product) {
        if (repository.get(product) == 1) {
            repository.remove(product);
        } else repository.merge(product, -1, Integer::sum);
    }
}

