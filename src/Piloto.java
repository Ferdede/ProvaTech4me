public class Piloto{
    private String _nome;
    String _cpf;
    
    
    public Piloto(String nome, String cpf){
        _nome = nome;
        _cpf = cpf;
    }
public String getnome(){
    return _nome;
}
public String getcpf(){
    return _cpf;
}

@Override
public String toString() {
    return  " [Nome:" + _nome + ", CPF: " + _cpf + "]";
}
public void add(Piloto piloto) {
}
}