package exemplo2;

public class Main {
    public static void main(String[] args) {
        No lista = new No();
        lista.dado = 1;
        lista.prox = null;

        System.out.println("Lista: " + lista);
        System.out.println("\t Dado: " + lista.dado);
        System.out.println("\t Prox: " + lista.prox);

        No novo = new No();
        novo.dado = 2;
        novo.prox = null;

        System.out.println("Novo: " + novo);
        System.out.println("\t Dado: " + novo.dado);
        System.out.println("\t Prox: " + novo.prox);

        lista.prox = novo;

        System.out.println("Lista: " + lista);
        System.out.println("\t Dado: " + lista.dado);
        System.out.println("\t Prox: " + lista.prox);

    }
}
