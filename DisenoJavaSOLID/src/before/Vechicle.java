package before;

public class Vechicle {
    VehicleType type;
    public Vechicle(VehicleType _type){
        this.type = _type;
    }
    VehicleType getType(){
        return this.type;
    }
    public String toString(){
        if(type == VehicleType.CAR){
            return "its a car";
        }
        return "its a motorbike";
    }
}
