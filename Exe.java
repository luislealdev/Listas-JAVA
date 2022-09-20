public class Exe {
    public static void main(String[] args) {
        ListaEstatica v_fFilaEstatica = new ListaEstatica(3);
        v_fFilaEstatica.m_in(10);
        // v_fFilaEstatica.m_in(20);
        v_fFilaEstatica.m_printFila();
        v_fFilaEstatica.m_in(5);
        v_fFilaEstatica.m_in(3);
        v_fFilaEstatica.m_printFila();
    }
}
