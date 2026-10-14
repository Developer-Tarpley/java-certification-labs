// Interface for devices with volume settings
interface Volume{
    abstract void increaseVolume();
    abstract void decreaseVolume();
}

// Interface for devices that can be turned on/off
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface for devices with adjustable settings
interface Adjustable {
    void increaseSpeed();
    void decreaseSpeed();
}

// Interface for devices that can connect to a network
interface Connectable {
    void connect();
    void disconnect();
}

class SmartSpeaker implements Switchable, Connectable, Volume{
    private boolean isOn = false;
    private boolean isConnected = false;
    private int loudness = 40;

    @Override 
    public void turnOn(){
        isOn = true;
        System.out.println("SmartSpeaker is turned ON.");
    }

    @Override 
    public void turnOff(){
        isOn = false;
        System.out.println("SmartSpeaker is turned OFF.");
    }

    @Override 
    public void connect(){
        isConnected = true;
        System.out.println("SmartSpeaker is connected to the network.");
    }

    @Override 
    public void disconnect(){
        isConnected = false;
        System.out.println("SmartSpeaker is disconnected from the network.");
    }

    @Override 
    public void increaseVolume(){
        if(loudness < 100){
            loudness += 10;
            System.out.println("Loudness increased to " + loudness + "%.");
        }
        else{
            System.out.println("Loudness is already at the maximum.");
        }
    }
    @Override 
    public void decreaseVolume(){
        if(loudness > 0){
            loudness -= 10;
            System.out.println("Loudness decreased to " + loudness + "%.");
        }
        else{
            System.out.println("Loudness is already at the minimum.");
        }
    }
}

class Fan implements Switchable, Adjustable{
    private boolean isOn = false;
    private int speed = 15;

    @Override 
    public void turnOn(){
        isOn = true;
        System.out.println("Fan is turned ON.");
    }

    @Override 
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is turned OFF.");
    }

    @Override 
    public void increaseSpeed(){
        if(speed < 90){
            speed += 15;
            System.out.println("Speed increased to " + speed + "%.");
        }
        else {
            System.out.println("Speed already at maximum.");
        }
    }

    @Override 
    public void decreaseSpeed(){
        if(speed > 0){
            speed -= 15;
            System.out.println("Speed decreased to " + speed + "%.");
        }
        else {
            System.out.println("Speed already at minimum.");
        }
    }
}