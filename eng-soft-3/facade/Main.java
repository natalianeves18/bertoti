// Classe Main
public class Main {
    public static void main(String[] args) {
        // Usando a classe Facade para interagir com o subsistema
        ProductFacade productFacade = new ProductFacade();

        // Chamando os métodos simplificados da Facade
        productFacade.createProduct();
        productFacade.updateProduct();
        productFacade.deleteProduct();
    }
}
