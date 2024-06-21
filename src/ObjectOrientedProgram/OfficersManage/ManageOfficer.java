package src.ObjectOrientedProgram.OfficersManage;

import java.util.ArrayList;
import java.util.List;

public class ManageOfficer {
    private List<Officer> officers;

    public ManageOfficer() {
        this.officers = new ArrayList<>();
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    public List<Officer> searchOfficerByName(String name) {
        List<Officer> result = new ArrayList<>();
        for (Officer officer : officers) {
            if (officer.getName().contains(name)){
                result.add(officer);
            }
        }
        return result;
    }

    public void showOfficers() {
        for (Officer officer : officers) {
            System.out.println(officer);
        }
    }
}

