// escreva um programa em java que solicite dois números e exiba a soma,
//subtração, multiplicação e divisão desses números
 
// meu código GPT
 
public class INSS {
    private String nome;
    private Float salario;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }
 
    public Float calcularINSS() {
        float inss = 0.0f;
 
        if (salario <= 1412.00) {
            inss = salario*0.075f;
        }else if (salario <= 2666.68) {
            inss = salario*0.09f;
        }else if (salario <= 4000.03) {
            inss = salario*0.12f;
        }else if (salario <= 7786.02) {
            inss = salario*0.14f;
        }else{
            inss = salario*0.14f;
        }
        }
 
        return inss;
 
    }
    }
