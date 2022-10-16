public class Terapevt extends  Doctor{


    @Override
    public void lechenie() {
        System.out.println("Терапевт лечит");
    }

    public void naznachenie(int planLechenia){
        if(planLechenia == 1){
            System.out.println("Терапевт направил к хирургу");
            Hiryrg hiryrg = new Hiryrg();
            hiryrg.lechenie();
        }
        else if(planLechenia == 2){
            System.out.println("Терапевт направил к дантисту ");
            Dantist dantist = new Dantist();
            dantist.lechenie();
        }
        else {
            System.out.println("Теравпевт будет лечить сам ");
            Terapevt terapevt = new Terapevt();
            terapevt.lechenie();
        }

    }
}
