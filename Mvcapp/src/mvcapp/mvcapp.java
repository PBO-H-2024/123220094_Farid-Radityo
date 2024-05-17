package mvcapp;

public class mvcapp {
    public static void main(String[] args) {
        ViewContact vc = new ViewContact();
        ModelContact mc = new ModelContact();
        ControllerContact cc = new ControllerContact(mc, vc);
    }
}
