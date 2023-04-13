public class TarefaProgramar implements Tarefa {

    private Integer id;
    private String name;

    public void completarTarefa() {
        System.out.println(getClass().getSimpleName());
    }

    // standard constructor, getters, setters
}