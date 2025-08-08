package tn.smartdev.java.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        Handler professorOak = new ProfessorOak();
        Handler nurseJoy = new NurseJoy();
        Handler officerJenny = new OfficerJenny();

        professorOak.setSuccessor(nurseJoy);
        nurseJoy.setSuccessor(officerJenny);

        Request newbieRequest = new Request("newbie");
        professorOak.handleRequest(newbieRequest);

        Request healRequest = new Request("heal");
        professorOak.handleRequest(healRequest);

        Request crimeRequest = new Request("crime");
        professorOak.handleRequest(crimeRequest);

        Request unknownRequest = new Request("unknown");
        professorOak.handleRequest(unknownRequest);
    }
}
