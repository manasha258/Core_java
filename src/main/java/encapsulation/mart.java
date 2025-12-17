package encapsulation;
class product {
    private int product_id;
    private String product_name;
    private int product_amount;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }
}

    public class mart {
        public static void main(String[] args) {

            product pp = new product();
            pp.setProduct_id(101);
            pp.setProduct_name("rice");
            pp.setProduct_amount(2000);
            System.out.println("My product id is:" + pp.getProduct_id());
            System.out.println("My product name:" + pp.getProduct_name());
            System.out.println("My product ampount is:" + pp.getProduct_amount());

        }
}

