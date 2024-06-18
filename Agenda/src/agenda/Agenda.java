package agenda;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


public class Agenda implements Serializable{
    private ArrayList<Contato> contatos;
    private static final String ARQUIVO_CONTATOS = "Contatos.ser";

    public Agenda(){
        this.contatos = carregarContatos();
    }

    public void AdicionarContato(Contato contato){
        if (contato == null){
            System.out.println("Erro ao adicionar o contato, contato nulo!");
            return;
        }
        if (existeContato(contato.getNome())){
            System.out.println("Esse contato já existe");
            return;
        }

        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso");


    }

    public void removerContato(String nome){
        Contato contato = buscarContato(nome);
        if (contato != null){
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso");
        }else{
            System.out.println("Contato não encontrado");
        }
    }

    public void atualizarContato(String nome, String novoEmail, String novoTelefone ){
        Contato contato = buscarContato(nome);
        if (contato != null){
            contato.setEmail (novoEmail);
            contato.setTelefone (novoTelefone);
            System.out.println("Contato atualizado com sucesso");
        }else{
            System.out.println("Contato não encontrado")
            ;
        }
    }

    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("Nenhum contato na agenda");
        }else{
            contatos.sort(Comparator.comparing(Contato :: getNome));
            for (Contato contato : contatos){
                System.out.println(contato);
            }
        }
    }

    public void pesquisarContato(String nome){
        Contato contato = buscarContato(nome);
        if(contato != null){
            System.out.println(contato);
        }else{
            System.out.println("Contato não encontrado");
        }
    }

    public void salvarContato(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO_CONTATOS))){
            oos.writeObject(contatos);
            System.out.println("Contato salvo com sucesso");
        }catch (IOException e){
            System.out.println("Erro ao salvar contato" + e.getMessage());
        }
    }

    private ArrayList<Contato> carregarContatos(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS))){
            return (ArrayList<Contato>) ois.readObject();
        }catch (FileNotFoundException e){
            return new ArrayList<>();
        }catch (IOException | ClassNotFoundException e ){
            System.out.println("Erro ao carregar contatos " + e.getMessage());
            return new ArrayList<>();
        }
    }

    private Boolean existeContato(String nome){
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    private Contato buscarContato(String nome){
        for (Contato c : contatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }return null;
    }

    public ArrayList<Contato> getContatos(){
        return contatos;
    }
}
