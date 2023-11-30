package pattern.abstract_factory.companies;

public class Globo {

    protected String client;

    public Globo(String client) {
        this.client = client;
    }

    public void infoCompany(String price) {
        System.out.println("WELCOME TO GLOBO");
        System.out.println("With Globo your delivery arrives home very very hot, why? " +
                "Our excellent delivery drivers are the best cyclists in the city...just wait 20 minutes");
        System.out.println("Your order cost " + price);
    }

    public void comments() {
        System.out.println("_________ENJOY! " + client.toUpperCase() + "__________");
        System.out.println("Your order has been delivered...any complaint let us know");
    }
}
