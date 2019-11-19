package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        Consulta obj = new Consulta(10); 
        Consulta obj1 = new Consulta(9);
        Consulta obj2 = new Consulta(11);
        Consulta obj3 = new Consulta(1);
        Arvore tree = new Arvore();
        tree.add(obj);
        tree.add(obj1);
        tree.add(obj2);
        tree.add(obj3);
        tree.percorrer(tree.raiz);
    }
    
}
