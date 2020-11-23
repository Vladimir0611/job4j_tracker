package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

 public void init(Scanner scanner, Tracker tracker) {
  boolean run = true;
  while (run) {
   this.showMenu();
   System.out.print("Select: ");
   int select = Integer.valueOf(scanner.nextLine());
   if (select == 0) {
    System.out.println("=== Create a new Item ====");
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    Item item = new Item(name);
    tracker.add(item);
    item.setName(name);

   } else if (select == 1) {
    Item[] item = tracker.findAll();
    System.out.println("=== Show all Items ====");
    for (int index = 0; index < item.length; index++) {
     System.out.println(item[index].getName());
    }

   } else if (select == 2) {
    System.out.println("=== Edit item ====");
    System.out.println("Enter id:  ");
    int id = Integer.valueOf(scanner.nextLine());
    System.out.println("Enter name:  ");
    String name = scanner.nextLine();
    Item item = new Item();
    item.setName(name);
    tracker.replace(id, item);
    if (tracker.replace(id, item)) {
     System.out.println("Replace had been succes");
    } else {
     System.out.println("Replace falled");
    }

   }else if (select == 3) {
    System.out.println("=== Delete item ====");
    System.out.println("Enter id:  ");
    int id = Integer.valueOf(scanner.nextLine());
    tracker.delete(id);
    if (tracker.delete(id)) {
     System.out.println("Delete had been succes");
    } else {
     System.out.println("Delete falled");
    }

   }else if (select == 4) {
    System.out.println("=== Find item by id ====");
    System.out.println("Enter id:  ");
    int id = Integer.valueOf(scanner.nextLine());
    Item item = tracker.findById(id);
    if (tracker.findById(id) != null) {
     System.out.println(item.getName());
    } else {
     System.out.println("Заявка с таким id не найдена");
    }

   }else if (select == 5) {
     System.out.println("=== Find items by name ====");
     System.out.println("Enter name:  ");
     String name = scanner.nextLine();
     Item[] item = tracker.findByName(name);
     if (tracker.findByName(name) != null) {
      if (item.length > 0) {
       for (int index = 0; index < item.length; index++) {
        System.out.println(item[index]);
       }
      } else {
       System.out.println("Заявки с таким именем не найдены");
      }
     }
   } else if (select == 6) {
    run = false;
   }
  }
 }
 private void showMenu() {

  System.out.println("MENU:\n" +
          "0. Add new Item\n" +
          "1. Show all items\n" +
          "2. Edit item\n" +
          "3. Delete item\n" +
          "4. Find item by Id\n" +
          "5. Find items by name\n" +
          "6. Exit Program\n");

 }
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Tracker tracker = new Tracker();
  new StartUI().init(scanner, tracker);
 }
}



 


