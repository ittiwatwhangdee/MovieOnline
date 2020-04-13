package movieonline;
import java.util.Scanner;
public class MovieOnline {
    public static void main(String[] args) {
        
        int showtype;
        int sum;
        int pay;
        String a;
        int l = 0;
        System.out.println("--------ยินดีต้อนรับสู่ขายหนังออนไลน์--------");
        
        do {
            System.out.println("กรุณาเลือกอายุของคุณ>>> ");
            String[] type = {"1.6+", "2.13+", "3.18+", "4.All"};
            for (showtype = 0; showtype <= 3; showtype++) {
                System.out.println(type[showtype]);
            }
            Scanner sc = new Scanner(System.in);
            a = sc.nextLine();
            if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                l++;
            } else {
                System.out.println("กรุณาใส่เลข (1,2,3,4)");
            }
        } while (l != 1);
        String type = typemovie(a); // เอาค่า a ไปอยู่ typemovie รีเทรินหรือเก็บค่ามาที่ String type *โยนค่าไปเรื่อยๆ
        String select = typeselect(type); // เอาค่า type ไปอยู่ typeselect รีเทรินหรือเก็บค่ามาที่ String select
        String product = productselect(select); //
    }

    public static String typemovie(String b) {
        if (b.equals("1")) {
            System.out.println("6+");
            String c = "6+";
            b = c;

        }
        if (b.equals("2")) {
            System.out.println("13+");
            String c = "13+";
            b = c;

        }
        if (b.equals("3")) {
            System.out.println("18+");
            String c = "18+";
            b = c;

        }
        if (b.equals("4")) {
            System.out.println("All");
            String c = "All";
            b = c;
        }
        return b;
    }

    public static String typeselect(String d) {

        System.out.println("------ประเภทหนัง " + d + " ขึ้นไป------");
        if (d.equals("6+")) {
            int exit = 0;
            do {
                Scanner b1 = new Scanner(System.in);
                System.out.println("1.Adventure");
                System.out.println("2.Comedy");
                System.out.println("3.Cartoon");
                String b = b1.nextLine();
                if (b.equals("1")) {
                    String c = "Adventure";
                    d = c;
                    exit++;
                }
                if (b.equals("2")) {
                    String c = "Comedy";
                    d = c;
                    exit++;
                }
                if (b.equals("3")) {
                    String c = "Cartoon";
                    d = c;
                    exit++;
                }
                if (exit == 0) {
                    System.out.println("กรุณากด 1,2,3");
                }
            } while (exit != 1);
        }
        if (d.equals("13+")) {
            int exit = 0;
            do {
                Scanner b1 = new Scanner(System.in);
                System.out.println("1.Adventure");
                System.out.println("2.Comedy");
                System.out.println("3.Romantic");
                String b = b1.nextLine();
                if (b.equals("1")) {
                    String c = "Adventure2";
                    d = c;
                    exit++;
                }
                if (b.equals("2")) {
                    String c = "Comedy2";
                    d = c;
                    exit++;
                }
                if (b.equals("3")) {
                    String c = "Romantic";
                    d = c;
                    exit++;
                }
                if (exit == 0) {
                    System.out.println("กรุณากด 1,2,3");
                }
            } while (exit != 1);
        }
        if (d.equals("18+")) {
            int exit = 0;
            do {
                Scanner b1 = new Scanner(System.in);
                System.out.println("1.Action");
                System.out.println("2.Adventure");
                System.out.println("3.Romantic");
                String b = b1.nextLine();
                if (b.equals("1")) {
                    String c = "Action";
                    d = c;
                    exit++;
                }
                if (b.equals("2")) {
                    String c = "Adventure3";
                    d = c;
                    exit++;
                }
                if (b.equals("3")) {
                    String c = "Romantic2";
                    d = c;
                    exit++;
                }
                if (exit == 0) {
                    System.out.println("กรุณากด 1,2,3");
                }
            } while (exit != 1);
        }
        if (d.equals("All")) {
            int exit = 0;
            do {
                Scanner b1 = new Scanner(System.in);
                System.out.println("1.Action");
                System.out.println("2.Thriller");
                System.out.println("3.Fantacy");
                String b = b1.nextLine();
                if (b.equals("1")) {
                    String c = "Action2";
                    d = c;
                    exit++;
                }
                if (b.equals("2")) {
                    String c = "Thriller";
                    d = c;
                    exit++;
                }
                if (b.equals("3")) {
                    String c = "Fantacy";
                    d = c;
                    exit++;
                }
                if (exit == 0) {
                    System.out.println("กรุณากด 1,2,3");
                }
            } while (exit != 1);
        }

        return d;

    }
//====================================================================================================

    public static String productselect(String e) {
        int sum = 0;
        int i;
        int pay;
        char exit;
        int x = 0;

        String number[] = {"1", "2", "3", "4"};
        String spare[] = {"Jumanji", "TheAdventuresofTintin", "Indianajones", "PiratesoftheCaribbean"};
        if (e.equals("Adventure")) {
            int exitt = 0;
            do {
                do {
                    String priece[] = {"60", "60", "60", "60"};
                    for (i = 0; i < 4; i++) { //การวนอ่านค่าจากอาเรย์
                        System.out.println(number[i] + "  " + spare[i] + "  " + priece[i] + " บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Jumanji 60 บาท");
                            sum = sum + 60;
                            b = "Jumanji";
                            e = b;
                            break;
                        case "2":
                            System.out.println("TheAdventuresofTintin 60 บาท");
                            sum = sum + 60;
                            b = "TheAdventuresofTintin";
                            e = b;
                            break;
                        case "3":
                            System.out.println("Indianajones 60 บาท");
                            sum = sum + 60;
                            b = "Indianajones";
                            e = b;
                            break;
                        case "4":
                            System.out.println("PiratesoftheCaribbean 60 บาท");
                            sum = sum + 60;
                            b = "PiratesoftheCaribbean";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0); //ตัวพิมพ์เล็กตัวที่ 1 เริ่มจาก 0
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");
        }
        if (e.equals("Comedy")) {
            int exitt = 0;
            do {
                do {
                    String priece1[] = {"70", "70", "70", "70"};
                    String spare1[] = {"Mr Bean", "The Hangover", "Ted", "Spy"};
                    for (i = 0; i < 4; i++) { //การวนอ่านค่าจากอาเรย์
                        System.out.println(number[i] + "  " + spare1[i] + "  " + priece1[i] + " บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Mr Bean 70 บาท");
                            sum = sum + 70;
                            b = "Mr Bean";
                            e = b;
                            break;
                        case "2":
                            System.out.println("The Hangover  70 บาท");
                            sum = sum + 70;
                            b = "The Hangover ";
                            e = b;
                            break;
                        case "3":
                            System.out.println("Ted 70 บาท");
                            sum = sum + 70;
                            b = "Ted";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Spy 70 บาท");
                            sum = sum + 70;
                            b = "Spy";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Cartoon")) {
            int exitt = 0;
            do {
                do {
                    String priece2[] = {"69", "69", "69", "69"};
                    String spare2[] = {"Frozen", "Dragon", "ToyStory", "Madagascar"};
                    
                    for (i = 0; i < 4; i++) { //การวนอ่านค่าจากอาเรย์
                        System.out.println(number[i] + "  " + spare2[i] + "  " + priece2[i] + " บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Frozen 69 บาท");
                            sum = sum + 69;
                            b = "Frozen";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Dragon 69 บาท");
                            sum = sum + 69;
                            b = "Dragon";
                            e = b;
                            break;
                        case "3":
                            System.out.println("ToyStory 69 บาท");
                            sum = sum + 69;
                            b = "ToyStory";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Madagascar 69 บาท");
                            sum = sum + 69;
                            b = "Madagascar";
                            e = b;
                            break;
                      
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Adventure2")) {
            int exitt = 0;
            do {
                do {
                    String priece3[] = {"70", "70", "70", "70"};
                    String spare3[] = {"LaraCroftTombRaider", "Journey2", "Avenger", "NationalTreasure"};
                    for (i = 0; i < 4; i++) { //การวนอ่านค่าจากอาเรย์
                        System.out.println(number[i] + "  " + spare3[i] + "  " + priece3[i] + " บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("LaraCroftTombRaider 70 บาท");
                            sum = sum + 70;
                            b = "LaraCroftTombRaider";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Journey2 70 บาท");
                            sum = sum + 70;
                            b = "Journey2";
                            e = b;
                            break;
                        case "3":
                            System.out.println("Avenger 70 บาท");
                            sum = sum + 70;
                            b = "Avenger";
                            e = b;
                            break;
                        case "4":
                            System.out.println("NationalTreasure 70 บาท");
                            sum = sum + 70;
                            b = "NationalTreasure";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Comedy2")) {
            int exitt = 0;
            do {
                do {
                    String priece4[] = {"69", "69", "69", "69"};
                    String spare4[] = {"Charlie’s Angels", "Bad Boys", "American Pie", "Superbad"};
                    for (i = 0; i < 4; i++) { //การวนอ่านค่าจากอาเรย์
                        System.out.println(number[i] + "  " + spare[i] + "  " + priece4[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Charlie’s Angels 69 บาท");
                            sum = sum + 69;
                            b = "Charlie’s Angels";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Bad Boys 69 บาท");
                            sum = sum + 69;
                            b = "Bad Boys";
                            e = b;
                            break;
                        case "3":
                            System.out.println("American Pie 69 บาท");
                            sum = sum + 69;
                            b = "American Pie";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Superbad 69 บาท");
                            sum = sum + 69;
                            b = "Superbad";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Romantic")) {
            int exitt = 0;//-------------------------------------
            do {//------
                do {
                    String priece5[] = {"89", "89", "89", "89"};
                    String spare5[] = {"Fifty shade of grey", "Titanic", "Beauty and the Beast", "Your Name"};
                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare[i] + "  " + priece5[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("เลือกอะไหล่ >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Fifty shade of grey 6000 บาท");
                            sum = sum + 89;
                            b = "Fifty shade of grey";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Titanic 89 บาท");
                            sum = sum + 89;
                            b = "Titanic";
                            e = b;
                            break;
                        case "3":
                            System.out.println("Beauty and the Beast 89 บาท");
                            sum = sum + 89;
                            b = "Beauty and the Beast";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Your Name 89 บาท");
                            sum = sum + 89;
                            b = "Your Name";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Action")) {
            int exitt = 0;//-------------------------------------
            do {//------
                do {
                    String priece6[] = {"89", "89", "89", "89"};
                    String spare6[] = {"IronMan", "SpiderMan", "Thor", "CaptainAmerica"};

                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare6[i] + "  " + priece6[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("IronMan 89 บาท");
                            sum = sum + 89;
                            b = "IronMan";
                            e = b;
                            break;
                        case "2":
                            System.out.println("SpiderMan 89 บาท");
                            sum = sum + 89;
                            b = "SpiderMan";
                            e = b;
                            break;
                        case "3":
                            System.out.println("Thor 89 บาท");
                            sum = sum + 89;
                            b = "Thor";
                            e = b;
                            break;
                        case "4":
                            System.out.println("CaptainAmerica 89 บาท");
                            sum = sum + 89;
                            b = "CaptainAmerica";
                            e = b;
                            break;
                   
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("--------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Adventure3")) {
            int exitt = 0;
            do {
                do {
                    String priece7[] = {"60", "60", "60", "60"};
                    String spare7[] = {"GeminiMan", "Dora", "StarTrek", "Alice"};

                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare7[i] + "  " + priece7[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("GeminiMan 60 บาท");
                            sum = sum + 60;
                            b = "GeminiMan";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Dora 60 บาท");
                            sum = sum + 60;
                            b = "Dora";
                            e = b;
                            break;
                        case "3":
                            System.out.println("StarTrek 60 บาท");
                            sum = sum + 60;
                            b = "StarTrek";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Alice 60 บาท");
                            sum = sum + 60;
                            b = "Alice";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Romantic2")) {
            int exitt = 0;
            do {
                do {
                    String priece8[] = {"79", "79", "79", "79"};
                    String spare8[] = {"Fifty shades freed", "LoveRoise", "LaLaLand", "Equals"};
                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare8[i] + "  " + priece8[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Fifty shades freed 79 บาท");
                            sum = sum + 79;
                            b = "Fifty shades freed";
                            e = b;
                            break;
                        case "2":
                            System.out.println("LoveRoise 79 บาท");
                            sum = sum + 79;
                            b = "LoveRoise";
                            e = b;
                            break;
                        case "3":
                            System.out.println("LaLaLand 79 บาท");
                            sum = sum + 79;
                            b = "LaLaLand";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Equals 79 บาท");
                            sum = sum + 79;
                            b = "Equals";
                            e = b;
                            break;
                  
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Action2")) {
            int exitt = 0;//-------------------------------------
            do {//------
                do {
                    String priece9[] = {"79", "79", "79", "79"};
                    String spare9[] = {"Terminator", "Godzilla", "X-Men", "Transformer"};
                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare9[i] + "  " + priece9[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Terminator 79 บาท");
                            sum = sum + 79;
                            b = "Terminator";
                            e = b;
                            break;
                        case "2":
                            System.out.println("Godzilla 79 บาท");
                            sum = sum + 79;
                            b = "Godzilla";
                            e = b;
                            break;
                        case "3":
                            System.out.println("X-Men 79 บาท");
                            sum = sum + 79;
                            b = "X-Men";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Transformer 79 บาท");
                            sum = sum + 79;
                            b = "Transformer";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Thriller")) {
            int exitt = 0;
            do {
                do {
                    String priece10[] = {"70", "70", "70", "70"};
                    String spare10[] = {"Conjuring", "IT", "LaLlorona", "Annabell"};
                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare10[i] + "  " + priece10[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("เลือกอะไหล่ >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Conjuring YSS 70 บาท");
                            sum = sum + 70;
                            b = "Conjuring";
                            e = b;
                            break;
                        case "2":
                            System.out.println("IT 70 บาท");
                            sum = sum + 70;
                            b = "IT";
                            e = b;
                            break;
                        case "3":
                            System.out.println("LaLlorona 70 บาท");
                            sum = sum + 70;
                            b = "LaLlorona";
                            e = b;
                            break;
                        case "4":
                            System.out.println("Annabell 70 บาท");
                            sum = sum + 70;
                            b = "Annabell";
                            e = b;
                            break;
                       
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        if (e.equals("Fantacy")) {
            int exitt = 0;
            do {
                do {
                    String priece11[] = {"89", "89", "89", "89"};
                    String spare11[] = {"Maleficent", "JusticLeague", "WonderWomen", "HarryPotter"};

                    for (i = 0; i < 4; i++) {
                        System.out.println(number[i] + "  " + spare11[i] + "  " + priece11[i] + "บาท");
                    }
                    Scanner a1 = new Scanner(System.in);
                    System.out.print("กรุณาเลือกหนัง >>>>  ");
                    String a = a1.nextLine();
                    System.out.println("");
                    System.out.println("--------------------------");
                    String b;
                    switch (a) {
                        case "1":
                            System.out.println("Maleficent 89 บาท");
                            sum = sum + 89;
                            b = "Maleficent";
                            e = b;
                            break;
                        case "2":
                            System.out.println("JusticLeague 89 บาท");
                            sum = sum + 89;
                            b = "JusticLeague";
                            e = b;
                            break;
                        case "3":
                            System.out.println("WonderWomen 89 บาท");
                            sum = sum + 89;
                            b = "WonderWomen";
                            e = b;
                            break;
                        case "4":
                            System.out.println("HarryPotter 89 บาท");
                            sum = sum + 89;
                            b = "HarryPotter";
                            e = b;
                            break;
                        
                    }
                    if (a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4")) {
                        exitt = 1;
                    } else {
                        System.out.println("ใส่เฉพาะ 1-4");
                        exitt = 0;
                    }
                } while (exitt != 1);
                Scanner exit2 = new Scanner(System.in);
                System.out.println("กดออก y ทำต่อ n");
                String exit1 = exit2.nextLine();
                exit = exit1.toLowerCase().charAt(0);
            } while (exit != 'y');
            System.out.println("--------------------------");
            System.out.println("รวมทั้งหมดราคา" + sum + " บาท");
            if (sum >= 300) {
                System.out.println("ลด 10 %");
                sum = sum - (sum * 10 / 100);
            }
            System.out.println("ราคาที่ลดแล้ว  " + sum + "  บาท");
            Scanner pay1 = new Scanner(System.in);
            System.out.println("จ่าย");
            pay = pay1.nextInt();
            System.out.println("--------------------------");
            while (x <= 1) {
                if (pay < sum) {
                    System.out.println("เงินไม่พอ");

                    System.out.println("----------------------------");
                    System.out.println("จ่าย");
                    pay = pay1.nextInt();
                } else {
                    x++;
                }
            }
            System.out.println("--------------------------");
            System.out.println("เงินทอน  " + (pay - sum) + " บาท");
            System.out.println("ขอบคุณที่ใช้บริการ");
            System.out.println("**************************");

        }
        return e;
    }
}
