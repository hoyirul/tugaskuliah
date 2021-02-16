class Sepeda{
    float kecepatan;
    int gear;

    void tambahKecepatan(float a){
        kecepatan = kecepatan + a;
        sesuaikanGear();
    }

    void kurangiKecepatan(float a){
        kecepatan = kecepatan - a;
        sesuaikanGear();
    }

    void sesuaikanGear(){
        if(kecepatan < 10){
            gear = 1;
        }else if(kecepatan >= 10 && kecepatan < 20){
            gear = 2;
        }else if(kecepatan >= 20 && kecepatan < 40){
            gear = 3;
        }else{
            gear = 4;
        }
    }

    void tampil(){
        System.out.println("Kecepatan = " + kecepatan + ", Gear = " + gear);
    }
}