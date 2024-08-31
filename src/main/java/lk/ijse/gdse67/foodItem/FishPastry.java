package lk.ijse.gdse67.foodItem;

import lk.ijse.gdse67.contract.BakeryItem;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating Fish Pastry");
    }
}
