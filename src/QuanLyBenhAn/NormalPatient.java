public class NormalPatient extends Patient {
    private int cost;

    public NormalPatient(int stt, String id, String name, int dayIn, int dayOut, String reason, int cost) {
        super(stt, id, name, dayIn, dayOut, reason);
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "NormalPatient{" +
                "Patient{" +
                "stt=" + stt +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", reason='" + reason + '\'' +
                "cost=" + cost +
                '}';
    }
}
