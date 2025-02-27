package SmartHomeSystem;
/*Konkretne Klase:
Kreirajte barem tri konkretne klase koje proširuju klasu SmartDevice i implementiraju sučelje RemoteControllable:

SmartSpeaker (može puštati glazbu, podešavati glasnoću)*/
public class SmartSpeaker extends SmartDevice implements RemoteControllable {

    private boolean onOff=false;//defaultna postavka na iskljuceno
    private int volume=30;
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("ON")){
            onOff=true;
            System.out.println("SmartSpeaker is on");
        }
        else if (command.equalsIgnoreCase("OFF")){
            onOff=false;
            System.out.println("Smart Speaker is OFF");
        }
        try {
            if (command.startsWith("VOLUME")){
                int newVolume=Integer.parseInt(command.split(" ")[1]);
                volume=newVolume;
                System.out.println("The SmartSpeaker volume is:" +volume);
            }
            else {
                System.out.println("Invalid command formate. Use formate VOLUME [number]");

            }

        } catch (Exception e) {
            System.out.println(" Unknown format for the SmartSpeaker");

        }

    }

    @Override
    public void performAction() {
        System.out.println ("SmartSpeaker is " +(onOff ? "ON" :"OFF") +", volume is  "+volume);

    }

    @Override
    public void displayStatus() {
        System.out.println("SmartSpeaker is " +(onOff ? "ON" : "OFF"));
        System.out.println("Volume SmartSpeaker is " +volume);

    }
}
