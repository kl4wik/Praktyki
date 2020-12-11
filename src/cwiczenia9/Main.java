package cwiczenia9;

public class Main {

    // Zawraca największą liczbę w tablicy
    public static int najwiekszaLiczba(int[] arr) {
        // Ustawienie zmiennej n jako pierwszy element tablicy arr
        int n = arr[0];
        // Pętla przechodząca przez każdy element tablicy arr
        for(int i : arr) {
            // Sprawdzenie czy wartość aktualnie iterowanego elementu tablicy jest większa od n; jeśli tak - zaktualizowanie n
            if(i > n) {
                n = i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        // Stworzenie przykładowej tablicy
        int[] arr = {4, 89, 12, 53, 12, 439, 539, 12, 293, 95, 83};
        // Wyświetlenie wyniku funkcji najwiekszaLiczba(int[] arr), czyli największej liczby stworzonej wcześniej tablicy
        System.out.println(najwiekszaLiczba(arr));
    }

}
