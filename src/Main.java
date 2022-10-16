public class Main {
    public static void main(String[] args) {
Pacient pacient = new Pacient(9);
Terapevt terapevt = new Terapevt();
terapevt.naznachenie(pacient.planLechenia);
    }
}