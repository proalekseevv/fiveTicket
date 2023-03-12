

public class Main {
    public static void main(String[] args) {
        String[][] book = new String[][]{{"Достоевский", "Идиот"}, {"Толстой", "Война и мир"}, {"Тургенев", "Отцы и дети"}};
        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++) {
                System.out.print(book[i][j] + " ");

            }
            System.out.println();


        }


    }


}



//{{"Достоевский","Идиот"},{"Толстой","Война и мир"},{"Тургенев","Отцы и дети"}};




