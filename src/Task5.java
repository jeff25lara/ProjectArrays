public class Task5 {
    public static void main(String[] args) {
         /*
         Using 2D array create a grocery list.
         Inside you should have an array of veggies, fruits, dairy and sweets.
         Retrieve all values from that array using 2 different loops
         */

        String[][] groceryList={{"Tomatoes","Spinach","Carrots"},
                {"Apple","Orange","Bananas"},
                {"Milk","Cheese","Yogurt"},
                {"Candy","Chocolate","Cookies"}};
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.print(groceryList[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");

        for( String[] store : groceryList){
            for (String item : store){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
