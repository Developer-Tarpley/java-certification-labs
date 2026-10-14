public class ElectronicsOperate{
    public static void main(String[] args){
          // polymorphism
        Switchable smartSpeaker1 = new SmartSpeaker();
        Switchable fan1 = new Fan();
        smartSpeaker1.turnOn();
        smartSpeaker1.turnOff();
        fan1.turnOn();
        fan1.turnOff();

        // multiple inherintances
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        smartSpeaker.turnOn();
        smartSpeaker.increaseVolume();
        smartSpeaker.increaseVolume();
        smartSpeaker.decreaseVolume();
        smartSpeaker.connect();
        smartSpeaker.disconnect();
        smartSpeaker.turnOff();

        Fan fan = new Fan();
        fan.turnOn();
        fan.increaseSpeed();
        fan.decreaseSpeed();
        fan.decreaseSpeed();
        fan.turnOff();


        /**
         * casting
         */
        System.out.println("\n Method Casting\n");
        Switchable switchables[] = new Switchable[2];

        SmartSpeaker sp = new SmartSpeaker();
        Fan fn = new Fan();

        switchables[0] = sp;
        switchables[1] = fan;

        for(int i = 0; i < switchables.length; i++){
            switchables[i].turnOn();
            switchables[i].turnOff();
        }

        ((Volume) switchables[0]).increaseVolume();
        ((Volume) switchables[0]).decreaseVolume();
        ((Volume) switchables[0]).decreaseVolume();
        ((Connectable) switchables[0]).connect();
        ((Connectable) switchables[0]).disconnect();
        
        ((Adjustable) switchables[1]).decreaseSpeed();
        ((Adjustable) switchables[1]).increaseSpeed();
        ((Adjustable) switchables[1]).increaseSpeed();
    }
}