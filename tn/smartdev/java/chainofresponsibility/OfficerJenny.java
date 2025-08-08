package tn.smartdev.java.chainofresponsibility;

public class OfficerJenny extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals("crime")) {
            System.out.println("Officer Jenny is on the case!");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
