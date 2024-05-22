public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
    }
}
