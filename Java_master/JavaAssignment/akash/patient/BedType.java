package patient;

enum BedType {
    ECONOMY(200),
    STANDARD(350),
    LUXURY(500);

    public final int cost;
    
    BedType(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
