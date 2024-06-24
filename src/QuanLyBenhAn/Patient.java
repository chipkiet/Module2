public abstract class Patient {
    protected int stt;
    protected String id;
    protected String name;
    protected int dayIn;
    protected int dayOut;
    protected String reason;


    public Patient(int stt, String id, String name, int dayIn, int dayOut, String reason) {
        this.stt = stt;
        this.id = id;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reason = reason;
    }

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

    public int getDayIn() {
        return dayIn;
    }

    public void setDayIn(int dayIn) {
        this.dayIn = dayIn;
    }

    public int getDayOut() {
        return dayOut;
    }

    public void setDayOut(int dayOut) {
        this.dayOut = dayOut;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


}
