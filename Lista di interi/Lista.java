/*
    Implementazione di una lista in java senza l'utilizzo della libreria ArrayList
*/

public class Lista implements ListaInteri{

    //ATTRIBUTI
        private Nodo head; // Nodo iniziale della lista
        private Nodo tail; // Nodo finale della lista
        private int dimensione;  // Dimensione della lista
    //---------

    public Lista(){
        this.head = null;
        this.tail = null;
        this.dimensione = 0;
    }

    /**
     * Aggiunge un nuovo nodo all'inizio della lista
     * @param value Il valore da aggiungere
     * @return void
     */
    @Override
    public void addTesta(int value){
        Nodo nuovoNodo = new Nodo(value);
        if (head == null){
            head = nuovoNodo; // si assegna il nuovo nodo (il primo) alla testa della lista
        } else{
            head.prev = nuovoNodo; // Aggiunge il nuovo nodo all'inizio
            nuovoNodo.next = head; //Aggiunge la vecchia testa come nodo successivo
            head = null;
        }
        head = nuovoNodo; // si assegna il nuovo nodo (l'ultimo) alla coda della lista
        dimensione++;
    }

    /**
     * Aggiunge un nuovo nodo alla fine della lista
     * @param value Il valore da aggiungere
     * @return void
     */
    @Override
    public void addCoda(int value){
        Nodo nuovoNodo = new Nodo(value);
        if (head == null){
            head = nuovoNodo; // si assegna il nuovo nodo (il primo) alla testa della lista
        } else{
            tail.next = nuovoNodo; // Aggiunge il nuovo nodo alla fine
            nuovoNodo.prev = tail; //Aggiunge la vecchia coda come nodo precedente
            tail = null;
        }
        tail = nuovoNodo; // si assegna il nuovo nodo (l'ultimo) alla coda della lista
        dimensione++;
    }



    /**
     * Restituisce la dimensione della lista
     * @param void
     * @return La dimensione della lista
     */
    @Override
    public int size(){
        return dimensione;
    }

    /**
     * Controlla se la lista è vuota
     * @param void
     * @return true se la lista è vuota, altrimanti false
     */
    @Override
    public boolean isEmpty(){
        if (dimensione == 0){
            return true; // La lista è vuota
        } else {
            return false; // La lista non è vuota
        }
    }

    /**
     * Stampa gli elementi della lista
     * @param void
     * @return void
     */
    @Override
    public void stampa(){
        Nodo nodoCorrente = head;
        while (nodoCorrente != null){
            System.out.println(nodoCorrente.value);
            nodoCorrente = nodoCorrente.next;
        }
    }

    public static void main(String[] args){
        Lista lista = new Lista();
        lista.addCoda(10);
        lista.addTesta(20);
        lista.addCoda(30);

        System.out.println("Dimensione della lista: " + lista.size() + " elementi.");
        if (lista.isEmpty()){
            System.out.println("La lista e' vuota.");
        } else {
            System.out.println("La lista non e' vuota.");
        }

        System.out.println("Elementi della lista:");
        lista.stampa();
    }
}