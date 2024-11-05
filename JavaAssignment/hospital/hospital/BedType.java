package hospital;

public enum BedType {
    General(500),
    VIP(800),
    ICU(1000);
    private final int cost;
    private BedType(int cost) {
        this.cost=cost;
    }
    public int getCost(){
        return cost;
    }

}
