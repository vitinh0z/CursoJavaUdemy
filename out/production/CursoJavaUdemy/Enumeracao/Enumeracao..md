# Enumerações

> Palavra chave: *enum*

## Exemplo

[pagamento] -> [Processando] -> [Enviado] -> [Entregue]

-----



    public enum OrderStatus {
        PENDING_PAYMENT,
        PROCESSING,
        DELIVERED;
    }


    public class Order {

        private Integer id;
        private Date moment;
        private OrderStatus status;
    }

