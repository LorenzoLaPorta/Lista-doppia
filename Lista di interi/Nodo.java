class Nodo{
    //ATTRIBUTI
        int value; // Valore del nodo
        Nodo next; // Riferimento al prossimo nodo
        Nodo prev; // Riferimento al nodo precedente
    //---------
    
    public Nodo(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}