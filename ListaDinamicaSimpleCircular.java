public class ListaDinamicaSimpleCircular {
    Nodo a_inicio, a_final;

    ListaDinamicaSimpleCircular() {
        a_inicio = null;
        a_final = null;
    }

    void m_in(int p_dato) {
        Nodo aux;
        Nodo temp = new Nodo(p_dato);
        if (a_inicio == null) {
            a_inicio = a_final = temp;
            a_inicio.siguiente = a_inicio;
        } else {
            if (p_dato < a_inicio.info) {
                temp.siguiente = a_inicio;
                a_inicio = temp;
                a_final.siguiente = a_inicio;
            } else {
                aux = m_buscarPosicion(p_dato);
                a_final = temp;
                temp.siguiente = a_inicio;
                aux.siguiente = temp;
            }
        }
    }

    Nodo m_buscarPosicion(int p_dato) {
        Nodo aux = a_inicio;
        if (aux != a_final) {
            while (aux.siguiente.info <= p_dato && aux.siguiente != a_inicio) {
                aux = aux.siguiente;
            }
        }
        return aux;
    }

    void m_imprimirInfo() {
        Nodo aux = a_inicio;
        System.out.print("[");
        while (a_inicio.siguiente != null && a_inicio != a_final) {
            System.out.print(a_inicio.info + "|");
            a_inicio = a_inicio.siguiente;
        }
        System.out.print(a_inicio.info + "]");
        a_inicio = aux;
    }
}