package lk.ijse.gdse67.foodItem;

import lk.ijse.gdse67.contract.BakeryItem;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating Fish Bun");
    }
}
