import java.util.Date;

public abstract class Patient {
    protected int stt;
    protected String id;
    protected String name;
    protected Date dayIn;
    protected Date dayOut;
    protected String reason;


    public Patient(int stt, String id, String name, Date dayIn, Date dayOut, String reason) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
    }
    public abstract double calCostOfNormalPatient();

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDayOut() {
        return dayOut;
    }

    public void setDayOut(Date dayOut) {
        this.dayOut = dayOut;
    }

    public Date getDayIn() {
        return dayIn;
    }

    public void setDayIn(Date dayIn) {
        this.dayIn = dayIn;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


}
