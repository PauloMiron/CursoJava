package Entidades;

import Entidades.Enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {

     private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

     private Date date;
     private OrderStatus status;
     private Cliente cliente;

     private List<OrderItem> ordemItem = new ArrayList<>();

     public Ordem (Date date,OrderStatus status,Cliente cliente){
          this.date = date;
          this.status = status;
          this.cliente = cliente;
     }


     public Date getDate(){
          return date;
     }

     public void setDate(Date date){
          this.date = date;
     }

     public Cliente getCliente(){
          return  cliente;
     }

     public void setCliente(Cliente cliente){
          this.cliente = cliente;
     }

     public OrderStatus getStatus(){
          return status;
     }

     public void setStatus(OrderStatus status){
          this.status = status;
     }

     public List<OrderItem> getOrdemItem(){
          return ordemItem;
     }



     public void adicionarItem(OrderItem OrderItem){
          ordemItem.add(OrderItem);
     }

     public void removerItem(OrderItem OrderItem){
          ordemItem.remove(OrderItem);
     }


     public double total(){
          double soma = 0.00;
          for(OrderItem item : ordemItem){
               soma = soma + item.subTotal();
          }
          return soma;
     }

     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append("Data Pedido: ");
          sb.append(sdf.format(date) + "\n");
          sb.append("Pedido status: ");
          sb.append(status + "\n");
          sb.append("Cliente: ");
          sb.append(cliente + "\n");
          sb.append("Itens Pedido:\n");
          for (OrderItem item : ordemItem) {
               sb.append(item + "\n");
          }
          sb.append("Preço total $");
          sb.append(String.format("%.2f", total()));
          return sb.toString();
     }




}
