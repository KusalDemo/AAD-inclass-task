package lk.ijse.gdse67.foodItem;

import lk.ijse.gdse67.contract.BakeryItem;
import lk.ijse.gdse67.customAnnotation.FinalAnnotation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ChickenBun")
@FinalAnnotation
public class ChickenRoll implements BakeryItem {
    @Override
    public void eat() {
        System.out.println("Eating chicken roll");
    }
}
