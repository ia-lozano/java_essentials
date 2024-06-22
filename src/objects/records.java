package objects;

public class records {
    // A record is a simple Java class great for simple objects
    // that only require fields an methods to access those fields

    public record Account(
        int id,
        int customerId,
        String type,
        double balance
    ) {}

    // Records can be instantiated just like classes
    Account account = new Account(13344, 12212, "CHECKING", 4033.93);

    // Records are immutable, there are no setter methods generated for records
    // account.setType("SAVINGS"); gives a compilation error

    // To access record info, use the name field
    double balance = account.balance();

}
