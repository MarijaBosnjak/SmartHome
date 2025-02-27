package SmartHomeSystem;
/*Apstraktna Klasa:
Kreirajte apstraktnu klasu pod nazivom SmartDevice s:

Dvije apstraktne metode:
performAction()
displayStatus()

Jednom konkretno implementiranom metodom:
updateFirmware(String version) koja ažurira verziju firmvera uređaja.*/

public abstract class SmartDevice {
    private String firmwareVersion="1.0";//Pretpostavljena pocetna verzija
    public abstract void performAction();
   public  abstract  void displayStatus();

 public void updateFirmware(String version){
     this.firmwareVersion=version;
     System.out.println("Ažurirana verzija firmwvera uređaja je: " +this.firmwareVersion);
 }
}
