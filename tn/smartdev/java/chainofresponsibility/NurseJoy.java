package tn.smartdev.java.chainofresponsibility;

public class NurseJoy extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("heal")) {
            System.out.println("Nurse Joy heals your pokemon!");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
