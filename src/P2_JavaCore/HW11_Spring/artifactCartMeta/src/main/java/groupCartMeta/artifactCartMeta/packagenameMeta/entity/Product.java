package groupCartMeta.artifactCartMeta.packagenameMeta.entity;

import java.util.Objects;

public class Product {
    private final int vendorCode;
    private final String title;

    public Product(int vendorCode, String title) {
        this.vendorCode = vendorCode;
        this.title = title;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product that = (Product) o;
        return vendorCode == that.vendorCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorCode);
    }

    @Override
    public String toString() {
        return "Product{" +
                "vendorCode=" + vendorCode +
                ", title='" + title + '\'' +
                '}';
    }
}