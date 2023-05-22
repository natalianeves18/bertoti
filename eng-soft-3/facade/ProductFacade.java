// Classe Facade
class ProductFacade {
    private Product product;

    public ProductFacade() {
        product = new Product();
    }

    public void createProduct() {
        product.createProduct();
    }

    public void updateProduct() {
        product.updateProduct();
    }

    public void deleteProduct() {
        product.deleteProduct();
    }
}