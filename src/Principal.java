import Entidades.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entidades.Enum.OrderStatus;
import Entidades.Ordem;
import Entidades.OrderItem;
import Entidades.Produto;

public class Principal {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");

        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Data Nascimento: ");
        Date dataNascimento = formatoData.parse(scanner.next());
        Cliente cliente = new Cliente(nomeCliente,email, dataNascimento);

        System.out.println("Informe qual o Status do pedido: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Ordem ordem = new Ordem(new Date(),status,cliente);

        System.out.println("Informe a quantidade de itens:");
        Integer n = scanner.nextInt();


        for (int i = 1; i <= n;i++){
            System.out.println("Informe o produto N°"+i);
            System.out.print("Nome do Produto:  ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            Double preco = scanner.nextDouble();
            Produto produto = new Produto(nome,preco);


            System.out.print("Informe a quantidade: ");
            Integer quantidade = scanner.nextInt();
            OrderItem orderItem = new OrderItem(quantidade,preco,produto);


           ordem.adicionarItem(orderItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(ordem);






    }

}
