package Olimpíada;

public class TestaAtleta {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil");
        Pais eua = new Pais("EUA");

        Atleta a1 = new Atleta("Anderson Silva", 95, brasil);
        Atleta a2 = new Atleta("Jon Jone", 55, eua);
        Atleta a3 = new Atleta("Vitor Belfort", 85, brasil);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("Total de Participantes: " + Atleta.getTotalParticipantes());
    }
}

