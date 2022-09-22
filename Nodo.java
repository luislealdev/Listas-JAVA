// public class Nodo {
//     int info;
//     Nodo siguiente;

//     Nodo(int p_info) {
//         info = p_info;
//         siguiente = null;
//     }
// }

public class Nodo {
    int info;
    Nodo siguiente, anterior;

    Nodo(int p_info) {
        info = p_info;
        siguiente = null;
        anterior=null;
    }
}
