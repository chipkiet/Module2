package src.ObjectOrientedProgram.OfficersManage;

public class Engineer extends Officer {
    private String trainJob;


    public Engineer(String trainJob, String name, int age, String gender, String address){
        super(name, age, gender, address);
        this.trainJob = trainJob;
    }

    public String getTrainJob() {
        return trainJob;
    }

    public void setTrainJob(String trainJob) {
        this.trainJob = trainJob;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "trainJob='" + trainJob + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
