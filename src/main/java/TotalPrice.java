public class TotalPrice {

    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount";


        str = str.replaceAll("[^\\d\\s]", "").trim();
        str = str.replaceAll("\\s+", " ");


        String[] arr = str.split(" ");

        double laptop_price = Double.parseDouble(arr[1]);
        double mouse_price = Double.parseDouble(arr[2]);
        double discountPercentage = Double.parseDouble(arr[4]);


        double total = laptop_price + mouse_price;


        double discountAmount = (discountPercentage / 100.0) * total;
        double finalPrice = total - discountAmount;

        System.out.println("Total cost after discount: " + finalPrice);
    }



}







