public interface CRUD {
    boolean addProduct(Product product);
    Product findProduct(String id);
    boolean updateProduct(String id, double newBasePrice);
    boolean deleteProduct(String id);
}