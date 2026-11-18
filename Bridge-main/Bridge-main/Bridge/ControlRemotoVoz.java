package Bridge;

public class ControlRemotoVoz extends ControlRemoto {

    public ControlRemotoVoz(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void togglePower() {
        System.out.println("Control por Voz: Procesando comando de voz para encender/apagar...");
        if (dispositivo.isEnabled()) {
            dispositivo.disable();
        } else {
            dispositivo.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Control por Voz: Bajando volumen por voz");
        dispositivo.setVolume(dispositivo.getVolume() - 5);
    }

    @Override
    public void volumeUp() {
        System.out.println("Control por Voz: Subiendo volumen por voz");
        dispositivo.setVolume(dispositivo.getVolume() + 5);
    }

    @Override
    public void channelDown() {
        System.out.println("Control por Voz: Canal anterior por voz");
        dispositivo.setChannel(dispositivo.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Control por Voz: Siguiente canal por voz");
        dispositivo.setChannel(dispositivo.getChannel() + 1);
    }

    // Método exclusivo del control por voz
    public void ejecutarComandoEspecial(String comando) {
        System.out.println("Control por Voz: Ejecutando comando especial -> \"" + comando + "\"");
    }
}