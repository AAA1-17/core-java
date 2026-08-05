package test3;

public class Dept {
    private String deptName;
    private Employeeloyee manager;

    public Dept() {
    }

    public Dept(String deptName, Employeeloyee manager) {
        this.deptName = deptName;
        this.manager = manager;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Employeeloyee getManager() {
        return manager;
    }

    public void setManager(Employeeloyee manager) {
        this.manager = manager;
    }
}
