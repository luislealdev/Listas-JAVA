// FUNCIONANDO AL 100, NECESITA TIPO DE NODO CON ANTERIOR Y SIGUIENTE, SE
// COMENTA PARA QUE NO CHOQUE CON LOS DEMÁS CÓDIGOS

// public class ListaDinamicaSimpleDoble {
// Nodo a_inicio;

// ListaDinamicaSimpleDoble() {
// a_inicio = null;
// }

// void m_in(int p_dato) {
// Nodo aux;
// Nodo temp = new Nodo(p_dato);
// if (a_inicio == null)
// a_inicio = temp;
// else {
// if (p_dato < a_inicio.info) {
// temp.siguiente = a_inicio;
// a_inicio = temp;
// temp.siguiente.anterior = a_inicio;
// } else {
// aux = m_buscarPosicion(p_dato);
// if (aux.siguiente == null) {
// aux.siguiente = temp;
// aux.siguiente.anterior = aux;
// } else {
// temp.siguiente = aux.siguiente;
// temp.siguiente.anterior = temp;
// temp.anterior = aux;
// aux.siguiente = temp;
// }
// }
// }
// }

// void m_out(int p_dato) {
// Nodo aux = m_buscarPosicion(p_dato);
// aux.anterior.siguiente = aux.siguiente;
// aux.siguiente.anterior = aux.anterior;
// }

// Nodo m_buscarPosicion(int p_dato) {
// Nodo aux = a_inicio;
// while (aux.siguiente != null && aux.siguiente.info <= p_dato) {
// aux = aux.siguiente;
// }
// return aux;
// }

// void m_imprimirInfo() {
// Nodo aux = a_inicio;
// System.out.print("[");
// while (a_inicio.siguiente != null) {
// System.out.print(a_inicio.info + "|");
// a_inicio = a_inicio.siguiente;
// }
// System.out.print(a_inicio.info + "]");
// a_inicio = aux;
// }
// }
