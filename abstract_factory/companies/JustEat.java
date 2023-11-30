package pattern.abstract_factory.companies;

public class JustEat {

    protected String client;

    public JustEat(String client) {
        this.client = client;
    }

    public void infoCompany(String price) {
        System.out.println("<<<<-----------JUST EAT ----------->>>>");
        System.out.println("With Just Eat your order is faster than others companies, you will get it in 10 minutes");
        System.out.println("Total amount: " + price);
    }

    public void comments() {
        System.out.println("Dear ".concat(client).concat(", your order has been satisfactorily delivered. Any problem? Let us know!"));
    }
}
