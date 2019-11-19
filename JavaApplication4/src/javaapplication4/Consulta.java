package javaapplication4;

public class Consulta implements Comparable<Consulta>{
    private int valor_consulta;
    
    public Consulta(int valor){
        this.valor_consulta = valor;
    }
    
    @Override
    public int compareTo(Consulta obj){
        return ((this.get_valor()) - (obj.get_valor()));
    }
    @Override
    public String toString(){
        return(this.valor_consulta+" ");
    }
    
    
    public int get_valor(){return valor_consulta;}
    public void set_valor(int valor){if(valor != 0){valor_consulta = valor;}}
}
