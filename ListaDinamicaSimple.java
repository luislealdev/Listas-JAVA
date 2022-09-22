public class ListaDinamicaSimple {
    Nodo a_inicio;

    ListaDinamicaSimple() {
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

    void m_out(int p_dato) {
        Nodo aux = m_buscarPosicionDetras(p_dato);
        aux.siguiente = aux.siguiente.siguiente;
    }

    // LISTA DOBLE
    // aux.ant.sig = temp;
    //

    Nodo m_buscarPosicion(int p_dato) {
        Nodo aux = a_inicio;
        while (aux.siguiente != null && aux.siguiente.info <= p_dato) {
            aux = aux.siguiente;
        }
        return aux;
    }

    Nodo m_buscarPosicionDetras(int p_dato) {
        Nodo aux = a_inicio;
        while (aux.siguiente != null && aux.siguiente.info < p_dato) {
            aux = aux.siguiente;
        }
        return aux;
    }

    void m_imprimirInfo() {
        Nodo aux = a_inicio;
        System.out.print("[");
        while (a_inicio.siguiente != null) {
            System.out.print(a_inicio.info + "|");
            a_inicio = a_inicio.siguiente;
        }
        System.out.print(a_inicio.info + "]");
        a_inicio = aux;
    }
}

// LISTA DOBLE
// Crear in, crear out
// Al meter en medio
// temp.sig=anterior.siguiente
// anterior.siguiente = temp
// temp.siguiente.anterior = temp
// temp.anterior = aux