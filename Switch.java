

public class Switch {
    
    public static void main(String[] args) {
        int day =3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "lunes" ;
                break;
            case 2:
                dayName = "Martes" ;
                break;
            case 3:
                dayName = "miercoles" ;
                break;
            default:
             dayName = "dia no valido";
                break;
        }
        System.out.println("Dia de hoy es " + dayName);
    }
}