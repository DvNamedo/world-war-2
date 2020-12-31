package example.content;

import mindustry.ctype.ContentList;

public class WW3 implements ContentList {
    private final ContentList[] contents = {
            new EItems()
    };

    public void load() {
        for (ContentList list : contents) {
            list.load();
        }
    }

}
