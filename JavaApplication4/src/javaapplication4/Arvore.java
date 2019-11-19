package javaapplication4;
import java.util.Collection;
import java.util.Iterator;

public class Arvore<T extends Comparable<? super T>> implements Collection<T> {

    protected NO raiz;

    public Arvore() {
        raiz = null;
    }
    @Override
    public boolean add(T obj) {
    if (raiz == null) {
        raiz = new NO(obj);
    }
    NO current = raiz;
    while (true) {
        if (obj.compareTo(current.consulta) > 0){
            if(current.direita == null){
                current.direita =  new NO(obj);
                return true;
            }
            else{
                current = current.direita;
            }
        }
        else if(obj.compareTo(current.consulta) < 0){
            if(current.esquerda == null){
                current.esquerda = new NO(obj);
                return true;
            }
            else{
                current = current.esquerda;
            }
        }
        else if(obj.compareTo(current.consulta) == 0)
            return false;
        }
    }
    
    public void remove(Consulta obj, NO no) {

    }

    public void percorrer(NO no) {
        if(no.esquerda != null){percorrer(no.esquerda);}
        else{System.out.print(no+"\n");}
    }
    @Override
    public int size() {
        return 1;
    }

    @Override
    public TreeIterator iterator() {
        TreeIterator interact = new TreeIterator();
        return interact;
    }

    public NO get_raiz() {
        return raiz;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    ///////////////////////////////////////////////////////////////////////////////////
    public class NO {

        protected NO esquerda;
        protected NO direita;
        protected T consulta;
        protected boolean visitado;

        public NO(T obj) {
            this.consulta = obj;
            esquerda = null;
            direita = null;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    public class TreeIterator implements Iterator{
        private NO atual;
        private NO proximo;

        public TreeIterator(){

        }

        @Override
        public boolean hasNext(){
            return (null != this.next());
        }

        @Override
        public NO next(){
            return atual;
        }

        @Override
        public void remove(){

        }
    }

}
