import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);

       int km,yas,type;
       System.out.print("mesafeyi giriniz :");
       km= inp.nextInt();
       System.out.print("Yasınızı giriniz :");
       yas= inp.nextInt();
       System.out.print("yolculuk tipini seciniz Tek yon=>1 ,Çift yon=>2 :");
       type= inp.nextInt();

       double normaltutar=km*0.10;
       double yasindirimi=normaltutar*0.10;
       double indirimlitutar=normaltutar-yasindirimi;
       double gdbiletiindirimi=indirimlitutar*0.20;
       double toplamtutar=(indirimlitutar-gdbiletiindirimi)*2;

       if(km>0 && yas>0 && type==1 || type==2){
          if(type==1){
              if(yas<12){
                  System.out.print("Ödenecek tutar:"+(normaltutar*0.5));
              }
              if(yas>=12 && yas<24){
                  System.out.print("Ödenecek tutar:"+(normaltutar*(0.9)));
              }
              if(yas>=24 && yas<65){
                  System.out.print("Ödenecek tutar:"+(normaltutar));
              }
              else {
                  System.out.print("Ödenecek tutar:"+(normaltutar*(70/100)));
              }
          }
           if(type==2){
               if(yas<12){
                   System.out.print("Ödenecek tutar:"+(normaltutar*0.5*0.2));
               }
               if(yas>=12 && yas<24){
                   System.out.print("Ödenecek tutar:"+(normaltutar*0.9 *0.8*2));
               }
               if(yas>=24 && yas<65){
                   System.out.print("Ödenecek tutar:"+(normaltutar*(0.8)));
               }
               else {
                   System.out.print("Ödenecek tutar:"+(normaltutar*(70/100)*0.2));
               }


           }

       }
else {
           System.out.println("Hatalı veri girdiniz!!");
    }
    }
}