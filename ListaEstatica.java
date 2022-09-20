public class ListaEstatica {
    int a_inicio, a_final;
    int a_datos[];
    int a_contadorDesocupados;
    boolean a_error;

    ListaEstatica(int p_cantidad) {
        a_datos = new int[p_cantidad];
        if (a_inicio == a_final) {
            a_inicio = a_datos[0];
            a_contadorDesocupados = p_cantidad;
        }
    }

    void m_in(int p_dato) {
        if (a_contadorDesocupados > 0) {
            if (a_contadorDesocupados == a_datos.length) {
                a_datos[0] = p_dato;
            } else {
                int contador;
                for (contador = 0; contador < a_datos.length - a_contadorDesocupados; contador++) {
                    if (p_dato < a_datos[contador]) {
                        int aux = a_datos[contador];
                        a_datos[contador] = p_dato;
                        a_datos[contador+1] = aux;
                        contador=a_datos.length;
                        p_dato=aux;
                    }else{

                    }
                }
            }
            a_contadorDesocupados--;
            a_final++;
        } else
            a_error = true;
    }

    // int m_out(int p_info) {

    // }

    void m_printFila() {
        int contador;
        System.out.print("\n[");
        for (contador = 0; contador < a_datos.length; contador++) {
            System.out.print("|" + a_datos[contador] + "|");
        }
        System.out.print("]");
    }
}