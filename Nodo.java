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
    Nodo siguiente, ant;

    Nodo(int p_info) {
        info = p_info;
        siguiente = null;
        ant=null;
    }
}
