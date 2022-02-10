package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        //Testando o add
        minhaLista.add("Teste0");
        System.out.println(minhaLista);

        //Testando o remove
        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("Teste1");
        System.out.println(minhaLista);

        //As adições acontecem na cauda!
        minhaLista.add("Teste2");
        minhaLista.add("Teste3");
        minhaLista.add("Teste4");
        System.out.println(minhaLista);
        System.out.println("------------------------------");

        //Testando o get
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println("------------------------------");

        //Testando o throw
        System.out.println(minhaLista.get(4));
        System.out.println(minhaLista.get(10));//Ele percorre a lista dando voltas, afinal, é uma lista circular
        System.out.println("------------------------------");

        //Testando o size
        System.out.println("Tamanho da lista: " + minhaLista.size());
        System.out.println("------------------------------");

        //Dando voltas na lista
        int voltas = 0;
        for (int i = 0; i < 20; i++){
            if(i % minhaLista.size() == 0){
                System.out.println("Volta nº " + voltas);
                voltas++;
            }
            System.out.println(minhaLista.get(i));
        }
    }
}
