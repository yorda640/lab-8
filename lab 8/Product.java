//package lab8;
//
//
//    import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Product {
//        public static void main(String[] args) {
//            List<Product> products = new ArrayList<>();
//            products.add(new Product("Laptop", 999.99, 2022));
//            products.add(new Product("Phone", 599.99, 2021));
//            products.add(new Product("Tablet", 299.99, 2023));
//
//            // Task a: Sort by price
//            Collections.sort(products, Comparator.comparing(Product::getPrice));
//            System.out.println("Sorted by price: " + products);
//
//            // Task b: Sort by title
//            Collections.sort(products, Comparator.comparing(Product::getTitle));
//            System.out.println("Sorted by title: " + products);
//
//            // Task c: Java 7 way using closure
//            Comparator<Product> priceComparator = new Comparator<Product>() {
//                @Override
//                public int compare(Product p1, Product p2) {
//                    return Double.compare(p1.getPrice(), p2.getPrice());
//                }
//            };
//
//            Collections.sort(products, priceComparator);
//            System.out.println("Sorted by price using Java 7 way: " + products);
//
//            // Task d: Java 8 way using lambdas
//            Collections.sort(products, Comparator.comparing(Product::getTitle)
//                    .thenComparing(Comparator.comparing(Product::getModel)));
//            System.out.println("Sorted by title and model using Java 8 way: " + products);
//        }
//    }
//
//
