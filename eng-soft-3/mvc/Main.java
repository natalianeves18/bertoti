
public class Main {
    public static void main(String[] args) {
        // Criando o modelo
        User user = new User("John Doe", 30);

        // Criando a view
        UserView userView = new UserView();

        // Criando o controlador e associando o modelo e a view
        UserController userController = new UserController(user, userView);

        // Atualizando o modelo
        userController.setUserName("Jane Smith");
        userController.setUserAge(25);

        // Atualizando a view
        userController.updateUserView();
    }
}
