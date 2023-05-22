package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountCountPrivate;

    public Order(Long memberId, String itemName, int itemPrice, int discountCountPrivate) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountCountPrivate = discountCountPrivate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountCountPrivate=" + discountCountPrivate +
                '}';
    }

    public int calculatePrice(){
        return itemPrice - discountCountPrivate;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountCountPrivate() {
        return discountCountPrivate;
    }

    public void setDiscountCountPrivate(int discountCountPrivate) {
        this.discountCountPrivate = discountCountPrivate;
    }


}
