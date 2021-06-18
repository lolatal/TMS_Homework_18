/**
 * Two people are trying to call each other. None of them can receive the call unless one of them hangs up. Thus, this can go forever,
 * while they keep calling each other simultaneously.
 */

public class Caller {
    private String name;

    public Caller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void call(Caller executor) {

        System.out.println(executor.getName() + " is calling " + this.name);
        executor.receiveTheCall(this);

    }

    public synchronized void receiveTheCall(Caller executor) {
        System.out.println(executor.getName() + " has received the call from " + this.name);
    }

}
