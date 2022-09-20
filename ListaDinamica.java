public class ListaDinamica {
    Nodo a_inicio;

    ListaDinamica() {
        a_inicio = null;
    }

    void m_in(int p_dato) {
        Nodo aux;
        Nodo temp = new Nodo(p_dato);
        if (a_inicio == null)
            a_inicio = temp;
        else {
            if (p_dato < a_inicio.info) {
                temp.siguiente = a_inicio;
                a_inicio = temp;
            } else {
                aux = m_buscarPosicion(p_dato);
                temp.siguiente = aux.siguiente;
                aux.siguiente = temp;
            }
        }
    }

    // LISTA DOBLE
    // aux.ant.sig = temp;
    //

    Nodo m_buscarPosicion(int p_dato) {
        Nodo aux = a_inicio;
        // while (p_out >= aux.info) {
        // aux = aux.siguiente;
        // }
        while (aux.siguiente != null && aux.siguiente.info <= p_dato) {
            aux = aux.siguiente;
        }
        return aux;
    }
}

// LISTA DOBLE
// Crear in, crear out
// Al meter en medio
// temp.sig=anterior.siguiente
// anterior.siguiente = temp
// temp.siguiente.anterior = temp
// temp.anterior = aux