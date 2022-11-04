package j18_제네릭.와일드카드;

public class Main {
    public AnimalData<? extends Animal>/*잔한을 주는것 타클래스는 안된다 animal클래스를살속받아야만 사용이 가능하다*/ getanimal(int flag) {
        if (flag == 1){
        AnimalData<Human> animalData = new AnimalData<Human>(new Human());
        return animalData;
        }else if(flag==2){
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
        }
//        else if(flag==3){
////            AnimalData<Car> animalData = new AnimalData<Car>(new Car("Car"));
////            return animalData;
//        }
            return null;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getanimal(1));
    }
}
