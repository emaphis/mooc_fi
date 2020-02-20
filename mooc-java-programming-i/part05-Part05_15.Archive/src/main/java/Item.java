
public class Item {
    private String itemID;
    private String itemName;

    public Item(String itemID, String itemName) {
        this.itemID = itemID;
        this.itemName = itemName;
    }

    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    @Override
    public String toString() {
        return itemID + ": " + itemName;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) compared;

        if (itemID.equals(comparedItem.itemID)) {
            return true;
        }

        return false;
    }

}
