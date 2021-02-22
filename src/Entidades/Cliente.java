package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String nomeCliente;
    private String email;
    private Date dataNascimento;

    public Cliente(){
    }

    public Cliente(String nome, String email,Date dataNascimento){
        this.nomeCliente = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return nomeCliente+ " (" + sdf.format(dataNascimento) + ") - " + email;
    }
}
