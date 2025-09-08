package Composicao.PedidoCliente;

class ItensPedido {

    private Integer quantity;
    private double price;

    public ItensPedido (){

    }



    public ItensPedido(Integer quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }



    public Integer getQuantity() {
        return quantity;
    }



    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal () {
        return getPrice() * getQuantity();
    }
    

    






}