import java.util.Date;

public class VipPatient extends Patient{
    private String vip;
    private int vipTime;

    public VipPatient(int stt, String id, String name, Date dayIn, Date dayOut, String reason, String vip, int vipTime){
        super(stt, id, name, dayIn, dayOut, reason);
        this.vip = vip;
        this.vipTime = vipTime;
    }

    public int getVipTime() {
        return vipTime;
    }

    public void setVipTime(int vipTime) {
        this.vipTime = vipTime;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "VipPatient{" +
                "vip='" + vip + '\'' +
                ", vipTime=" + vipTime +
                ", stt=" + stt +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dayIn=" + dayIn +
                ", dayOut=" + dayOut +
                ", reason='" + reason + '\'' +
                '}';
    }

    @Override
    public double calCostOfNormalPatient() {
        return 0;
    }
}
