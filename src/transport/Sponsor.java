package transport;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void sponsorTheRace() {
        System.out.printf("Спонсор %s проспонсировал заезд %d%n", name, amount);
    }

    @Override
    public String toString() {
        return name + " сумма: " + amount + " рублей";
    }
}
