package tn.smartdev.java.chainofresponsibility;

public class ProfessorOak extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("newbie")) {
            System.out.println("Professor Oak gives you a new pokemon!");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
