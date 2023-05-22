
// Controller
class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public void setUserAge(int age) {
        model.setAge(age);
    }

    public void updateUserView() {
        String name = model.getName();
        int age = model.getAge();
        view.displayUserDetails(name, age);
    }
}
