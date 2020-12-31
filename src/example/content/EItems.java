package example.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class EItems implements ContentList {
    public static Item coreResource;

    @Override
    public void load() {
        coreResource = new Item("core-resource", Color.valueOf("d99d73")) {{
            cost = 100;
        }};
    }

}