public class Main {

    public static void main(String[] args) {
        int sayi = 7;
        int toplam = 1;
        for(int i=2;i<sayi;i++){
            if(sayi%i == 0)
            {
                toplam += i;
            }
        }
        if(sayi==toplam)
        {
            System.out.println("Mukemmel sayi");
        }
        else{
            System.out.println("Mukemmel sayi degildir");
        }
    }
}
