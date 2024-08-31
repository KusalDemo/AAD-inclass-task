package lk.ijse.gdse67.customer;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse67.contract.BakeryItem;
import lk.ijse.gdse67.customAnnotation.FinalAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private BakeryItem item;

    @Autowired
    @Qualifier("ChickenBun")
    @FinalAnnotation
    public void setItem(BakeryItem item) {
        this.item = item;
    }

    @PostConstruct
    public void init(){
        item.eat();
    }
}
