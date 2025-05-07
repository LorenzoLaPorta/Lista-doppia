/*
    Interfaccia per una lista di interi.
    Definisce i metodi per aggiungere un elemento, ottenere la dimensione, 
    controllare se la lista è vuota e stampare gli elementi della lista
*/

interface ListaInteri {
    void addTesta(int value);
    void addCoda(int value);
    int size();
    boolean isEmpty();
    void stampa();
}