public abstract class Item {

    private String name;
    private Integer price;
    private Integer quantity;

    public void order(Integer count) {
        checkQuantity(count);   // 1. quantity 확인
        createOrderPage();      // 2. 주문 내역 만들기
        completeOrder();        // 3. 주문완료
    }

    private void checkQuantity(Integer count) {
        String checkResult = quantity >= count ? "success" : "fail";
        System.out.println("checkResult : " + checkResult);
    }

    private void createOrderPage() {
        getName();          // 2-1. 상품 이름
        getPrice();         // 2-2. 상품 가격
        getInfomation();    // 2-3. 상품 상세정보
    }

    private void getName() {
        System.out.println("name : " + name);
    }

    private void getPrice() {
        System.out.println("price : " + price);
    }

    public abstract void getInfomation();

    private void completeOrder() {
        System.out.println("Complete Order!");
    }

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

// ---- 주문하기 ----
//

// 2-1. 상품 이름
// 2-2. 상품 가격
// 2-3. 상품 상세정보
// 3. 주문완료