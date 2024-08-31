package lk.ijse.gdse67.foodItem;

import lk.ijse.gdse67.contract.BakeryItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ChickenBun")
public class ChickenBun implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating chicken bun");
    }
}
