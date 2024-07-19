package collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> listaTarefa;

    public ListaDeTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adiconarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {

        ListaDeTarefas lista = new ListaDeTarefas();

        System.out.println("Número total de tarefas é: "  + lista.obterNumeroTotalDeTarefas());
        lista.adiconarTarefa("Lavar carro");
        System.out.println("Número total de tarefas é: "  + lista.obterNumeroTotalDeTarefas());
        lista.obterDescricoesTarefas();
    }
}
