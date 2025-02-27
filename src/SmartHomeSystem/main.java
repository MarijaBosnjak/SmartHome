package SmartHomeSystem;
/*U Main klasi:

Kreirajte objekte svakog pametnog uređaja.
        Izvršite akcije, prikažite njihov status i daljinski ih kontrolirajte.
Ažurirajte firmver svakog uređaja i prikažite ažurirani status.*/

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        SmartLight smartLight1 = new SmartLight();
        Scanner sc = new Scanner(System.in);
        System.out.println ("Adjust the light. Use format BRIGHTNESS [0-100] or ON/OFF for on/off");
        String command=sc.nextLine();
        smartLight1.remoteControl(command);
        smartLight1.displayStatus();
        smartLight1.performAction();
        SmartSpeaker smartSpeaker1 = new SmartSpeaker();
        System.out.println("Adjust the speaker. Use  formats VOLUME [number] for volume or ON/OFF for on/off");
        String commandSpeaker=sc.nextLine();
        smartSpeaker1.remoteControl(commandSpeaker);
        smartSpeaker1.performAction();
        smartSpeaker1.displayStatus();
        SmartThermostat smartThermostat1 = new SmartThermostat();
        System.out.println ("Adjust the thermostat.Use formats SET TEMP [number] or ON/OFF for on/off");
        String commandThermostat=sc.nextLine();
        smartThermostat1.remoteControl(commandThermostat);
        smartThermostat1.performAction();
        smartThermostat1.displayStatus();
    }
}
