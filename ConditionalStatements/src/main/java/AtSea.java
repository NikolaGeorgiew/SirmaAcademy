import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment = scanner.nextLine();
        int nights = days - 1;

        double totalPrice = 0;

        switch (typeOfRoom) {
            case "apartment":
                totalPrice = nights * 50;
                if (days < 10) {
                    totalPrice = totalPrice * 0.7;
                } else if (days >= 10 && days <= 15) {
                    totalPrice = totalPrice * 0.65;
                } else if (days > 15) {
                    totalPrice = totalPrice * 0.5;
                }
                break;
            case "single room":
                totalPrice = nights * 25;
                break;
            case "presidential":
                totalPrice = nights * 100;
                if (days < 10) {
                    totalPrice = totalPrice * 0.9;
                } else if (days >= 10 && days <= 15) {
                    totalPrice = totalPrice * 0.85;
                } else if (days > 15) {
                    totalPrice = totalPrice * 0.80;
                }
                break;
        }

        if (assessment.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else if (assessment.equals("negative")) {
            totalPrice = totalPrice * 0.9;
        }



//        if (typeOfRoom.equals("single room")) {
//            price = nights * 25;
//            if (assessment.equals("positive")) {
//                price = price * 1.25;
//            } else if (assessment.equals("negative")) {
//                price = price * 0.9;
//            }
//        } else if (typeOfRoom.equals("apartment")) {
//            price = nights * 50;
//            if (days < 10) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.7;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.7;
//                }
//            }  else if (days >= 10 && days <= 15) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.65;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.65;
//                }
//            } else if (days > 15) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.5;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.5;
//                }
//            }
//
//        } else if (typeOfRoom.equals("presidential")) {
//            price = nights * 100;
//            if (days < 10) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.9;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.9;
//                }
//            }  else if (days >= 10 && days <= 15) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.85;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.85;
//                }
//            } else if (days > 15) {
//                if (assessment.equals("positive")) {
//                    price = price * 0.2;
//                    price = price * 1.25;
//                } else if (assessment.equals("negative")) {
//                    price = price * 0.9;
//                    price = price * 0.2;
//                }
//            }
//        }

        System.out.printf("%.2f", totalPrice);
    }
}
