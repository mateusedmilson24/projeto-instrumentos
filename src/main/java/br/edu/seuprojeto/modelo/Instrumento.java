package br. edu.seuprojeto.modelo;
public class Instrumento {
private String nome;

public Instrumento(String nome) {this.nome = nome;}
public String getNome() { return nome;}
public void setNome (String nome) { this.nome = nome;);}

public void tocar () {
System.out.println("Som genérico dp instrumento");
}
@Override
public String toString() {
return "Instrumento[nome=" + nome + ]";
}
}
 EOL
cat > src/main/java/br/edu/seuprojeto/Main.java <<EOL
import br. edu.seuprojeto.modelo.*;
import java.util.*;
public class Main {
public static void main (String[] args {
Instrumento v = new Violao("violao clássico", 6);
Instrumento p = new piano("piano de cauda", 88);
 List<Instrumento>instrumentos = new ArrayList<>();
Instrumentos.add.(v);
instrumentos.add(P);
for(Instrumento instr: instrumentos) {
System.out.println(instr);
instr.tocar();
}
}
}
