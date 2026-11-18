package Bridge;

public class Projector implements Dispositivo {
    private boolean on = false;
    private int volume = 20;
    private int channel = 1;
    
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Proyector encendido");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Proyector apagado");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volumen del Proyector ajustado a: " + volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Canal/Entrada del Proyector ajustado a: " + channel);

    }

    @Override
    public void printStatus() {
    System.out.println("------------------------------------");
    System.out.println("| I'm projector");
    System.out.println("| The projector is " + (on ? "enabled" : "disabled"));
    System.out.println("| Volume is " + volume);
    System.out.println("| Channel is " + channel);
    System.out.println("------------------------------------");
        }

    }

