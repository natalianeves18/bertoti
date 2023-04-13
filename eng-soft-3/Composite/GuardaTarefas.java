public class GuardaTarefas implements Tarefa {
    private Integer id;
    private String name;

    private List<Tarefa> childTarefas;

    public GuardaTarefas(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childTarefas = new ArrayList<>();
    }

    public void completarTarefa() {
        childTarefas.forEach(Tarefa::completarTarefa);
    }

    public void addTarefa(Tarefa tarefa) {
        childTarefas.add(tarefa);
    }

    public void removeTarefa(Tarefa tarefa) {
        childTarefas.remove(tarefa);
    }
}