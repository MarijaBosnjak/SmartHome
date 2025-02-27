package SmartHomeSystem;
/*Konkretne Klase:
Kreirajte barem tri konkretne klase koje proširuju klasu SmartDevice i implementiraju sučelje RemoteControllable:

SmartLight (može se uključiti/isključiti, podešavati svjetlinu)*/

public class SmartLight extends  SmartDevice implements RemoteControllable {
  private boolean isOn=false;//iskljuceno je
    private int brightness=50;//Definirali smo pocetnu svjetlinu
    @Override
    public void remoteControl(String command) {
        if (command.equalsIgnoreCase("IS ON")) {
            isOn = true;
            System.out.println("SmartLight is now ON");
        }
        else if (command.equalsIgnoreCase("IS OFF")){
            isOn=false;
            System.out.println("SmartLight is now OFF");
        }
        else if (command.startsWith("BRIGHTNESS")){
            try {
                int newBrightness = Integer.parseInt(command.split(" ")[1]);
                if (newBrightness >= 0 && newBrightness <= 100) {
                    brightness = newBrightness;
                    System.out.println("Brightness set to: " + brightness);
                } else {
                    System.out.println("Invalid brightness.Must be between 0 and 100");
                }
            }catch (Exception e){
                    System.out.println("Invalid command format.Use format BRIGHTNESS [0-100]");

                }}
                else{
                    System.out.println("Unknown command for SmartLight");



        }
    }

    @Override
    public void performAction() {
        System.out.println("Smartlight is " + (isOn ? "ON": "OFF") +"\tbrightness is" +brightness+ "%");

    }

    @Override
    public void displayStatus() {
        System.out.println ("SmartLight is "+ (isOn ? "ON" : "OFF"));
        System.out.println("Brightnesess is " +brightness +"%");

    }
}
