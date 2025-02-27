package SmartHomeSystem;
/*Konkretne Klase:
Kreirajte barem tri konkretne klase koje proširuju klasu SmartDevice i implementiraju sučelje RemoteControllable:

SmartThermostat (može postaviti temperaturu, prikazati trenutnu temperaturu)*/


public class SmartThermostat extends  SmartDevice implements RemoteControllable {
    private int temperature=22;
    @Override
    public void remoteControl(String command) {
        if (command.startsWith("SET TEMP")) {
            try {
                int newTemerature = Integer.parseInt(command.split(" ")[2]);
                temperature = newTemerature;
                System.out.println("SmartThermostat  temperature set to : " + temperature);
            } catch (Exception e) {
                System.out.println("Invalid command format.Use; SET TEMP [number]");
            }
        }
            else {
                System.out.println("Unknown command for SmartThermostat");
            }



    }

    @Override
    public void performAction() {
        System.out.println("SmartThermostat is adjusting  the temperature");

    }

    @Override
    public void displayStatus() {
        System.out.println("The set temperature the SmartThermostat is" +temperature);

    }
}
